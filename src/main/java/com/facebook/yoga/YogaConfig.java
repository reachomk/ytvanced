package com.facebook.yoga;

import defpackage.anum;

public class YogaConfig {
    public long a;

    public YogaConfig() {
        long jni_YGConfigNew = jni_YGConfigNew();
        this.a = jni_YGConfigNew;
        if (jni_YGConfigNew == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    private native void jni_YGConfigFree(long j);

    private native long jni_YGConfigNew();

    private native void jni_YGConfigSetExperimentalFeatureEnabled(long j, int i, boolean z);

    private native void jni_YGConfigSetHasCloneNodeFunc(long j, boolean z);

    private native void jni_YGConfigSetLogger(long j, Object obj);

    private native void jni_YGConfigSetPointScaleFactor(long j, float f);

    private native void jni_YGConfigSetPrintTreeFlag(long j, boolean z);

    private native void jni_YGConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviour(long j, boolean z);

    private native void jni_YGConfigSetUseLegacyStretchBehaviour(long j, boolean z);

    public native void jni_YGConfigSetUseWebDefaults(long j, boolean z);

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        try {
            jni_YGConfigFree(this.a);
        } finally {
            super.finalize();
        }
    }

    private final YogaNode cloneNode(YogaNode yogaNode, YogaNode yogaNode2, int i) {
        YogaNodeCloneFunction yogaNodeCloneFunction = null;
        return yogaNodeCloneFunction.cloneNode(yogaNode, yogaNode2, i);
    }

    static {
        anum.a("yoga");
    }
}
