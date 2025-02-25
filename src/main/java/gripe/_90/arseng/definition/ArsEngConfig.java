package gripe._90.arseng.definition;

import net.neoforged.neoforge.common.ModConfigSpec;

public final class ArsEngConfig {
    private ArsEngConfig() {}

    public static final ModConfigSpec SPEC;

    public static final ModConfigSpec.DoubleValue AE_PER_SOURCE;
    public static final ModConfigSpec.IntValue OUTPUT_P2P_BUFFER;

    static {
        var builder = new ModConfigSpec.Builder();

        AE_PER_SOURCE = builder.comment("How much AE energy the Source Acceptor should produce per unit of source.")
                .defineInRange("ae_per_source", 16, 0, Double.MAX_VALUE);
        OUTPUT_P2P_BUFFER = builder.comment("The maximum source capacity of Source P2P output tunnels.")
                .defineInRange("output_p2p_buffer", 1000, 0, Integer.MAX_VALUE);

        SPEC = builder.build();
    }
}
