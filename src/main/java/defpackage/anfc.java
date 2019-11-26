package defpackage;

/* renamed from: anfc */
public final class anfc extends anxo implements anzf {
    private anfc() {
        super(anex.DEFAULT_INSTANCE);
    }

    /* synthetic */ anfc(byte b) {
        super(anex.DEFAULT_INSTANCE);
    }

    public final anfc a() {
        copyOnWrite();
        anex anex = (anex) this.instance;
        anex.bitField0_ |= 2097152;
        anex.allowHighPriorityAppRenderThread_ = true;
        return this;
    }

    public final anfc a(anfb anfb) {
        copyOnWrite();
        anex anex = (anex) this.instance;
        if (anfb != null) {
            anex.bitField0_ |= 32;
            anex.daydreamImageAlignment_ = anfb.value;
            return this;
        }
        throw new NullPointerException();
    }

    public final anfc a(boolean z) {
        copyOnWrite();
        anex anex = (anex) this.instance;
        anex.bitField0_ |= 2;
        anex.useSystemClockForSensorTimestamps_ = z;
        return this;
    }

    public final anfc b(boolean z) {
        copyOnWrite();
        anex anex = (anex) this.instance;
        anex.bitField0_ |= 4;
        anex.useMagnetometerInSensorFusion_ = z;
        return this;
    }

    public final anfc c(boolean z) {
        copyOnWrite();
        anex anex = (anex) this.instance;
        anex.bitField0_ |= 8;
        anex.allowDynamicLibraryLoading_ = z;
        return this;
    }

    public final anfc d(boolean z) {
        copyOnWrite();
        anex anex = (anex) this.instance;
        anex.bitField0_ |= 16;
        anex.cpuLateLatchingEnabled_ = z;
        return this;
    }

    public final anfc e(boolean z) {
        copyOnWrite();
        anex anex = (anex) this.instance;
        anex.bitField0_ |= 128;
        anex.useOnlineMagnetometerCalibration_ = z;
        return this;
    }

    public final anfc f(boolean z) {
        copyOnWrite();
        anex anex = (anex) this.instance;
        anex.bitField0_ |= 256;
        anex.useDeviceIdleDetection_ = z;
        return this;
    }

    public final anfc g(boolean z) {
        copyOnWrite();
        anex anex = (anex) this.instance;
        anex.bitField0_ |= 512;
        anex.useStationaryBiasCorrection_ = z;
        return this;
    }

    public final anfc h(boolean z) {
        copyOnWrite();
        anex anex = (anex) this.instance;
        anex.bitField0_ |= 1024;
        anex.allowDynamicJavaLibraryLoading_ = z;
        return this;
    }

    public final anfc i(boolean z) {
        copyOnWrite();
        anex anex = (anex) this.instance;
        anex.bitField0_ |= 2048;
        anex.touchOverlayEnabled_ = z;
        return this;
    }

    public final anfc j(boolean z) {
        copyOnWrite();
        anex anex = (anex) this.instance;
        anex.bitField0_ |= 4096;
        anex.allowVrcoreHeadTracking_ = z;
        return this;
    }

    public final anfc k(boolean z) {
        copyOnWrite();
        anex anex = (anex) this.instance;
        anex.bitField0_ |= 8192;
        anex.allowVrcoreCompositing_ = z;
        return this;
    }

    public final anfc l(boolean z) {
        copyOnWrite();
        anex anex = (anex) this.instance;
        anex.bitField0_ |= 32768;
        anex.enableForcedTrackingCompat_ = z;
        return this;
    }

    public final anfc m(boolean z) {
        copyOnWrite();
        anex anex = (anex) this.instance;
        anex.bitField0_ |= 131072;
        anex.disallowMultiview_ = z;
        return this;
    }

    public final anfc n(boolean z) {
        copyOnWrite();
        anex anex = (anex) this.instance;
        anex.bitField0_ |= 262144;
        anex.dimUiLayer_ = z;
        return this;
    }

    public final anfc o(boolean z) {
        copyOnWrite();
        anex anex = (anex) this.instance;
        anex.bitField0_ |= 524288;
        anex.useDirectModeSensors_ = z;
        return this;
    }

    public final anfc p(boolean z) {
        copyOnWrite();
        anex anex = (anex) this.instance;
        anex.bitField0_ |= 1048576;
        anex.allowPassthrough_ = z;
        return this;
    }
}
