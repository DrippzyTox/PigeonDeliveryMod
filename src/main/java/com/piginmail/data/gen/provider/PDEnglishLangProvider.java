package com.piginmail.data.gen.provider;

import com.piginmail.item.group.PDItemGroup;
import com.piginmail.registry.ItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import org.jetbrains.annotations.NotNull;

public class PDEnglishLangProvider extends FabricLanguageProvider {
    public PDEnglishLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        ItemRegistry.getItems().forEach((s, item) -> translationBuilder.add(item, trimString(capitalizeString(s))));
        translationBuilder.add("itemGroup.piginmail.main", "Pigin Mail");
    }

    /**
     * A method to capitalize a string and remove anything what's between it.
     * <a href="https://stackoverflow.com/questions/1892765/how-to-capitalize-the-first-character-of-each-word-in-a-string">Source</a>
     * @param string the string you want to capitalize.
     * @return a capitalised string.
     */
    public static @NotNull String capitalizeString(@NotNull String string) {
        char[] chars = string.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i]) || chars[i] == '.' || chars[i] == '_') {
                found = false;
            }
        }
        return String.valueOf(chars);
    }

    public static @NotNull String trimString(String string) {
        return string.replace("_", " ");
    }
}
