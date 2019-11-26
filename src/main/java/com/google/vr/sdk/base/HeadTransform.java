package com.google.vr.sdk.base;

import android.opengl.Matrix;

public class HeadTransform {
    public final float[] headView = new float[16];

    public HeadTransform() {
        Matrix.setIdentityM(this.headView, 0);
    }

    public float[] getHeadView() {
        return this.headView;
    }

    public void getHeadView(float[] fArr, int i) {
        if (fArr.length >= 16) {
            System.arraycopy(this.headView, 0, fArr, 0, 16);
            return;
        }
        throw new IllegalArgumentException("Not enough space to write the result");
    }
}
