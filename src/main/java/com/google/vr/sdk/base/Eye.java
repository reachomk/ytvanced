package com.google.vr.sdk.base;

public class Eye {
    public final float[] eyeView = new float[16];
    public final FieldOfView fov = new FieldOfView();
    public float lastZFar;
    public float lastZNear;
    public float[] perspective;
    public volatile boolean projectionChanged = true;
    public final int type;
    public final Viewport viewport = new Viewport();

    public Eye(int i) {
        this.type = i;
    }

    public int getType() {
        return this.type;
    }

    public float[] getEyeView() {
        return this.eyeView;
    }

    public float[] getPerspective(float f, float f2) {
        if (!this.projectionChanged && this.lastZNear == 0.1f && this.lastZFar == 20000.0f) {
            return this.perspective;
        }
        if (this.perspective == null) {
            this.perspective = new float[16];
        }
        getFov().toPerspectiveMatrix(0.1f, 20000.0f, this.perspective, 0);
        this.lastZNear = 0.1f;
        this.lastZFar = 20000.0f;
        this.projectionChanged = false;
        return this.perspective;
    }

    public FieldOfView getFov() {
        return this.fov;
    }

    private void setValues(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        this.viewport.setViewport(i, i2, i3, i4);
        this.fov.setAngles(f, f2, f3, f4);
        this.projectionChanged = true;
    }
}
