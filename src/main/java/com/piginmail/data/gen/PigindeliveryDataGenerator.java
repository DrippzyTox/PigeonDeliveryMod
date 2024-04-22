package com.piginmail.data.gen;

import com.piginmail.data.gen.provider.PDEnglishLangProvider;
import com.piginmail.data.gen.provider.PDModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class PigindeliveryDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(PDModelProvider::new);
		pack.addProvider(PDEnglishLangProvider::new);
	}
}
