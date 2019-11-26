package com.google.vr.ndk.base;

public class DaydreamCompatibility {
    public final int supportedHeadsets;

    public DaydreamCompatibility(int i) {
        this.supportedHeadsets = i;
    }

    public DaydreamCompatibility() {
        this(0);
    }

    public int getSupportedHeadsets() {
        return this.supportedHeadsets;
    }

    public boolean supportsDaydream() {
        return (this.supportedHeadsets & 5) != 0;
    }

    public boolean requiresDaydream() {
        return supportsDaydream() && !supportsCardboard();
    }

    public int toDeprecated() {
        if (requiresDaydream()) {
            return 3;
        }
        return !supportsDaydream() ? 1 : 2;
    }

    private boolean supportsCardboard() {
        return (this.supportedHeadsets & 2) != 0;
    }
}
