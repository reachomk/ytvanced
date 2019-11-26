package com.facebook.yoga;

import defpackage.anum;
import java.util.ArrayList;
import java.util.List;

public class YogaNode implements Cloneable {
    public YogaNode a;
    public List b;
    public YogaMeasureFunction c;
    public long d;
    public Object e;
    public float mBorderBottom = 0.0f;
    public float mBorderLeft = 0.0f;
    public float mBorderRight = 0.0f;
    public float mBorderTop = 0.0f;
    public boolean mDoesLegacyStretchFlagAffectsLayout = false;
    public int mEdgeSetFlag = 0;
    public boolean mHasNewLayout = true;
    public float mHeight = Float.NaN;
    public int mLayoutDirection = 0;
    public float mLeft = Float.NaN;
    public float mMarginBottom = 0.0f;
    public float mMarginLeft = 0.0f;
    public float mMarginRight = 0.0f;
    public float mMarginTop = 0.0f;
    public float mPaddingBottom = 0.0f;
    public float mPaddingLeft = 0.0f;
    public float mPaddingRight = 0.0f;
    public float mPaddingTop = 0.0f;
    public float mTop = Float.NaN;
    public float mWidth = Float.NaN;

    public YogaNode() {
        long jni_YGNodeNew = jni_YGNodeNew();
        this.d = jni_YGNodeNew;
        if (jni_YGNodeNew == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    public static native void jni_YGNodeCalculateLayout(long j, float f, float f2);

    private static native void jni_YGNodeClearChildren(long j);

    private native long jni_YGNodeClone(long j, Object obj);

    private static native void jni_YGNodeCopyStyle(long j, long j2);

    private static native void jni_YGNodeFree(long j);

    static native int jni_YGNodeGetInstanceCount();

    public static native void jni_YGNodeInsertChild(long j, long j2, int i);

    private static native void jni_YGNodeInsertSharedChild(long j, long j2, int i);

    private static native boolean jni_YGNodeIsDirty(long j);

    private static native boolean jni_YGNodeIsReferenceBaseline(long j);

    private static native void jni_YGNodeMarkDirty(long j);

    private static native void jni_YGNodeMarkDirtyAndPropogateToDescendants(long j);

    private native long jni_YGNodeNew();

    private native long jni_YGNodeNewWithConfig(long j);

    private static native void jni_YGNodePrint(long j);

    private static native void jni_YGNodeRemoveChild(long j, long j2);

    private static native void jni_YGNodeReset(long j);

    public static native void jni_YGNodeSetHasBaselineFunc(long j, boolean z);

    public static native void jni_YGNodeSetHasMeasureFunc(long j, boolean z);

    public static native void jni_YGNodeSetIsReferenceBaseline(long j, boolean z);

    private static native void jni_YGNodeSetOwner(long j, long j2);

    private static native int jni_YGNodeStyleGetAlignContent(long j);

    private static native int jni_YGNodeStyleGetAlignItems(long j);

    private static native int jni_YGNodeStyleGetAlignSelf(long j);

    private static native float jni_YGNodeStyleGetAspectRatio(long j);

    private static native float jni_YGNodeStyleGetBorder(long j, int i);

    public static native int jni_YGNodeStyleGetDirection(long j);

    private static native int jni_YGNodeStyleGetDisplay(long j);

    private static native Object jni_YGNodeStyleGetFlexBasis(long j);

    private static native int jni_YGNodeStyleGetFlexDirection(long j);

    private static native float jni_YGNodeStyleGetFlexGrow(long j);

    private static native float jni_YGNodeStyleGetFlexShrink(long j);

    public static native Object jni_YGNodeStyleGetHeight(long j);

    private static native int jni_YGNodeStyleGetJustifyContent(long j);

    private static native Object jni_YGNodeStyleGetMargin(long j, int i);

    private static native Object jni_YGNodeStyleGetMaxHeight(long j);

    private static native Object jni_YGNodeStyleGetMaxWidth(long j);

    private static native Object jni_YGNodeStyleGetMinHeight(long j);

    private static native Object jni_YGNodeStyleGetMinWidth(long j);

    private static native int jni_YGNodeStyleGetOverflow(long j);

    private static native Object jni_YGNodeStyleGetPadding(long j, int i);

    private static native Object jni_YGNodeStyleGetPosition(long j, int i);

    private static native int jni_YGNodeStyleGetPositionType(long j);

    public static native Object jni_YGNodeStyleGetWidth(long j);

    public static native void jni_YGNodeStyleSetAlignContent(long j, int i);

    public static native void jni_YGNodeStyleSetAlignItems(long j, int i);

    public static native void jni_YGNodeStyleSetAlignSelf(long j, int i);

    public static native void jni_YGNodeStyleSetAspectRatio(long j, float f);

    private static native void jni_YGNodeStyleSetBorder(long j, int i, float f);

    public static native void jni_YGNodeStyleSetDirection(long j, int i);

    private static native void jni_YGNodeStyleSetDisplay(long j, int i);

    public static native void jni_YGNodeStyleSetFlex(long j, float f);

    public static native void jni_YGNodeStyleSetFlexBasis(long j, float f);

    private static native void jni_YGNodeStyleSetFlexBasisAuto(long j);

    public static native void jni_YGNodeStyleSetFlexBasisPercent(long j, float f);

    public static native void jni_YGNodeStyleSetFlexDirection(long j, int i);

    public static native void jni_YGNodeStyleSetFlexGrow(long j, float f);

    public static native void jni_YGNodeStyleSetFlexShrink(long j, float f);

    public static native void jni_YGNodeStyleSetFlexWrap(long j, int i);

    private static native void jni_YGNodeStyleSetHeight(long j, float f);

    private static native void jni_YGNodeStyleSetHeightAuto(long j);

    public static native void jni_YGNodeStyleSetHeightPercent(long j, float f);

    public static native void jni_YGNodeStyleSetJustifyContent(long j, int i);

    public static native void jni_YGNodeStyleSetMargin(long j, int i, float f);

    public static native void jni_YGNodeStyleSetMarginAuto(long j, int i);

    public static native void jni_YGNodeStyleSetMarginPercent(long j, int i, float f);

    private static native void jni_YGNodeStyleSetMaxHeight(long j, float f);

    public static native void jni_YGNodeStyleSetMaxHeightPercent(long j, float f);

    private static native void jni_YGNodeStyleSetMaxWidth(long j, float f);

    public static native void jni_YGNodeStyleSetMaxWidthPercent(long j, float f);

    public static native void jni_YGNodeStyleSetMinHeight(long j, float f);

    public static native void jni_YGNodeStyleSetMinHeightPercent(long j, float f);

    public static native void jni_YGNodeStyleSetMinWidth(long j, float f);

    public static native void jni_YGNodeStyleSetMinWidthPercent(long j, float f);

    private static native void jni_YGNodeStyleSetOverflow(long j, int i);

    private static native void jni_YGNodeStyleSetPadding(long j, int i, float f);

    private static native void jni_YGNodeStyleSetPaddingPercent(long j, int i, float f);

    public static native void jni_YGNodeStyleSetPosition(long j, int i, float f);

    public static native void jni_YGNodeStyleSetPositionPercent(long j, int i, float f);

    public static native void jni_YGNodeStyleSetPositionType(long j, int i);

    private static native void jni_YGNodeStyleSetWidth(long j, float f);

    private static native void jni_YGNodeStyleSetWidthAuto(long j);

    public static native void jni_YGNodeStyleSetWidthPercent(long j, float f);

    public YogaNode(YogaConfig yogaConfig) {
        long jni_YGNodeNewWithConfig = jni_YGNodeNewWithConfig(yogaConfig.a);
        this.d = jni_YGNodeNewWithConfig;
        if (jni_YGNodeNewWithConfig == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        try {
            long j = this.d;
            if (j > 0) {
                this.d = 0;
                jni_YGNodeFree(j);
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public final int a() {
        List list = this.b;
        return list != null ? list.size() : 0;
    }

    public final YogaNode a(int i) {
        List list = this.b;
        if (list != null) {
            return (YogaNode) list.get(i);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }

    private final YogaNode c() {
        try {
            YogaNode yogaNode = (YogaNode) super.clone();
            long jni_YGNodeClone = jni_YGNodeClone(this.d, yogaNode);
            List<YogaNode> list = this.b;
            if (list != null) {
                for (YogaNode yogaNode2 : list) {
                    jni_YGNodeSetOwner(yogaNode2.d, 0);
                    yogaNode2.a = null;
                }
            }
            yogaNode.d = jni_YGNodeClone;
            yogaNode.a = null;
            List list2 = this.b;
            yogaNode.b = list2 != null ? (List) ((ArrayList) list2).clone() : null;
            List<YogaNode> list3 = yogaNode.b;
            if (list3 != null) {
                for (YogaNode yogaNode3 : list3) {
                    yogaNode3.a = null;
                }
            }
            return yogaNode;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final void a(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 2;
        jni_YGNodeStyleSetPadding(this.d, yogaEdge.j, f);
    }

    public final void b(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 2;
        jni_YGNodeStyleSetPaddingPercent(this.d, yogaEdge.j, f);
    }

    public final void c(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 4;
        jni_YGNodeStyleSetBorder(this.d, yogaEdge.j, f);
    }

    public final void a(float f) {
        jni_YGNodeStyleSetWidth(this.d, f);
    }

    public final void b(float f) {
        jni_YGNodeStyleSetHeight(this.d, f);
    }

    public final void c(float f) {
        jni_YGNodeStyleSetMaxWidth(this.d, f);
    }

    public final void d(float f) {
        jni_YGNodeStyleSetMaxHeight(this.d, f);
    }

    public final float a(YogaEdge yogaEdge) {
        int ordinal = yogaEdge.ordinal();
        if (ordinal == 0) {
            return this.mPaddingLeft;
        }
        if (ordinal == 1) {
            return this.mPaddingTop;
        }
        if (ordinal == 2) {
            return this.mPaddingRight;
        }
        if (ordinal == 3) {
            return this.mPaddingBottom;
        }
        if (ordinal == 4) {
            return b() != YogaDirection.RTL ? this.mPaddingLeft : this.mPaddingRight;
        } else if (ordinal == 5) {
            return b() != YogaDirection.RTL ? this.mPaddingRight : this.mPaddingLeft;
        } else {
            throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    public final float b(YogaEdge yogaEdge) {
        int ordinal = yogaEdge.ordinal();
        if (ordinal == 0) {
            return this.mBorderLeft;
        }
        if (ordinal == 1) {
            return this.mBorderTop;
        }
        if (ordinal == 2) {
            return this.mBorderRight;
        }
        if (ordinal == 3) {
            return this.mBorderBottom;
        }
        if (ordinal == 4) {
            return b() != YogaDirection.RTL ? this.mBorderLeft : this.mBorderRight;
        } else if (ordinal == 5) {
            return b() != YogaDirection.RTL ? this.mBorderRight : this.mBorderLeft;
        } else {
            throw new IllegalArgumentException("Cannot get layout border of multi-edge shorthands");
        }
    }

    public final YogaDirection b() {
        return YogaDirection.a(this.mLayoutDirection);
    }

    public final long measure(float f, int i, float f2, int i2) {
        YogaMeasureFunction yogaMeasureFunction = this.c;
        if (yogaMeasureFunction != null) {
            return yogaMeasureFunction.measure(this, f, YogaMeasureMode.a(i), f2, YogaMeasureMode.a(i2));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    public final float baseline(float f, float f2) {
        YogaBaselineFunction yogaBaselineFunction = null;
        return yogaBaselineFunction.baseline(this, f, f2);
    }

    private final long replaceChild(YogaNode yogaNode, int i) {
        List list = this.b;
        if (list != null) {
            list.remove(i);
            this.b.add(i, yogaNode);
            yogaNode.a = this;
            return yogaNode.d;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }

    public final /* synthetic */ Object clone() {
        return c();
    }

    static {
        anum.a("yoga");
    }
}
