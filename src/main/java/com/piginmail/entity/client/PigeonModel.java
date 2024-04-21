package com.piginmail.entity.client;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;

public abstract class PigeonModel<T extends Entity> extends EntityModel<T> {

	public static final EntityModelLayer LAYER_LOCATION = new EntityModelLayer(new Identifier("modid", "pigin_mail"), "main");
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart Body;
	private final ModelPart headbill;
	private final ModelPart rightwing;
	private final ModelPart leftwing;

	public PigeonModel(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Body = root.getChild("Body");
		this.headbill = root.getChild("headbill");
		this.rightwing = root.getChild("rightwing");
		this.leftwing = root.getChild("leftwing");
	}

	public static TexturedModelData createBodyLayer() {
		ModelData meshdefinition = new ModelData();
		ModelPartData partdefinition = meshdefinition.getRoot();

		ModelPartData RightLeg = partdefinition.addChild("RightLeg", ModelPartBuilder.create().uv(2, 2).cuboid(-2.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
				.uv(0, 1).cuboid(-2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.rotation(0.0F, 24.0F, 0.0F));

		ModelPartData LeftLeg = partdefinition.addChild("LeftLeg", ModelPartBuilder.create().uv(0, 0).cuboid(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 2).cuboid(1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData Body = partdefinition.addChild("Body", ModelPartBuilder.create().uv(0, 0).cuboid(-2.0F, -4.0F, -2.0F, 4.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.rotation(0.0F, 24.0F, 0.0F));

		ModelPartData headbill = partdefinition.addChild("headbill", ModelPartBuilder.create().uv(13, 0).cuboid(-1.0F, -18.0F, -3.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 8).cuboid(-1.0F, -19.0F, -2.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.rotation(0.0F, 36.0F, 0.0F));

		ModelPartData rightwing = partdefinition.addChild("rightwing", ModelPartBuilder.create().uv(0, 13).cuboid(-1.0F, -0.5F, -1.5F, 1.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.5F, 21.0F, 0.5F, 0.0F, 0.0F, 1.5708F));

		ModelPartData leftwing = partdefinition.addChild("leftwing", ModelPartBuilder.create(), ModelTransform.rotation(0.0F, 24.0F, 0.0F));

		ModelPartData leftwing_r1 = leftwing.addChild("leftwing_r1", ModelPartBuilder.create().uv(8, 8).cuboid(3.0F, 2.0F, -1.0F, 1.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		return TexturedModelData.of(meshdefinition, 32, 32);
	}

	@Override
	public void animateModel(T entity, float limbAngle, float limbDistance, float tickDelta) {
		super.animateModel(entity, limbAngle, limbDistance, tickDelta);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
		RightLeg.render(matrices, vertices, light, overlay, red, green, blue, alpha);
		LeftLeg.render(matrices, vertices, light, overlay, red, green, blue, alpha);
		Body.render(matrices, vertices, light, overlay, red, green, blue, alpha);
		headbill.render(matrices, vertices, light, overlay, red, green, blue, alpha);
		rightwing.render(matrices, vertices, light, overlay, red, green, blue, alpha);
		leftwing.render(matrices, vertices, light, overlay, red, green, blue, alpha);
	}
}