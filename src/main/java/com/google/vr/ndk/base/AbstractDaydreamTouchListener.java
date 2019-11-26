package com.google.vr.ndk.base;

import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import com.google.vr.sdk.proto.CardboardDevice$DaydreamInternalParams;
import com.google.vr.sdk.proto.CardboardDevice$ScreenAlignmentMarker;
import com.google.vr.sdk.proto.Display$DisplayParams;
import com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParams;
import defpackage.andw;
import defpackage.anep;
import defpackage.anes;
import defpackage.anfp;
import defpackage.anfq;
import defpackage.angf;
import defpackage.anxl;
import defpackage.baez;
import defpackage.bafh;

public abstract class AbstractDaydreamTouchListener {
    public int angleSamplesReceived = 0;
    public float borderSizeMeters;
    public double[] currentMarkerBestDists;
    public final float[] displayCutoutTranslation = new float[2];
    public DisplayMetrics displayMetrics;
    public boolean enabled = true;
    public boolean lastMotionEventInHeadset;
    public float[] lastTranslation = new float[2];
    public final String logTag = getClass().getSimpleName();
    public int[] markerBestTouch;
    public float[][] markersInPixels;
    public int mostTouchesSeen;
    public float[] pixelTranslation = new float[2];
    public float rotation;
    public int[] touchBestMarker;
    public float[] translation = new float[2];
    public boolean useRotationalAlignmentCorrection;
    public float xMetersPerPixel;
    public float yMetersPerPixel;

    public abstract boolean isDaydreamImageAlignmentEnabled();

    public abstract void logEvent(andw andw, angf angf);

    public abstract void setLensOffset(float f, float f2, float f3);

    public void setEnabled(boolean z) {
        this.enabled = z;
        if (!z) {
            resetTrackingState();
        }
    }

    public void getTranslationInScreenSpace(float[] fArr) {
        if (fArr.length >= 2) {
            DisplayMetrics displayMetrics = this.displayMetrics;
            if (displayMetrics == null) {
                Log.e(this.logTag, "displayMetrics must be set before calling getTranslationInScreenSpace.");
                return;
            }
            fArr[0] = this.pixelTranslation[0] / ((float) displayMetrics.widthPixels);
            fArr[1] = this.pixelTranslation[1] / ((float) this.displayMetrics.heightPixels);
            float f = fArr[0];
            fArr[0] = f + f;
            fArr[1] = fArr[1] * -2.0f;
            return;
        }
        throw new IllegalArgumentException("Translation array too small");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean handleTouch(MotionEvent motionEvent, float f, float f2) {
        if (!processMotionEvent(motionEvent, 0.0f, 0.0f)) {
            return false;
        }
        getTranslationInScreenSpace(this.translation);
        float[] fArr = this.translation;
        f2 = fArr[0];
        float[] fArr2 = this.lastTranslation;
        if (!(f2 == fArr2[0] && fArr[1] == fArr2[1])) {
            fArr2[0] = f2;
            fArr2[1] = fArr[1];
            setLensOffset(fArr[0], fArr[1], this.rotation);
        }
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void initWithDisplayParams(DisplayMetrics displayMetrics, Display$DisplayParams display$DisplayParams, baez baez) {
        this.displayMetrics = displayMetrics;
        this.borderSizeMeters = bafh.a(display$DisplayParams);
        this.xMetersPerPixel = bafh.a(this.displayMetrics.xdpi);
        this.yMetersPerPixel = bafh.a(this.displayMetrics.ydpi);
        if (baez != null) {
            int c = baez.c();
            int i = displayMetrics.widthPixels;
            int d = baez.d();
            int a = baez.a();
            int i2 = displayMetrics.heightPixels;
            int b = baez.b();
            this.displayCutoutTranslation[0] = (float) ((((i - d) + c) / 2) - (displayMetrics.widthPixels / 2));
            this.displayCutoutTranslation[1] = (float) ((((i2 - b) + a) / 2) - (displayMetrics.heightPixels / 2));
        } else {
            float[] fArr = this.displayCutoutTranslation;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
        }
        resetTrackingState();
    }

    /* Access modifiers changed, original: protected|final */
    public final void setDeviceParams(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        if (cardboardDevice$DeviceParams != null) {
            CardboardDevice$DaydreamInternalParams cardboardDevice$DaydreamInternalParams = cardboardDevice$DeviceParams.daydreamInternal;
            if (!(cardboardDevice$DaydreamInternalParams == null || cardboardDevice$DaydreamInternalParams.getAlignmentMarkersCount() == 0)) {
                if (this.displayMetrics == null) {
                    Log.e(this.logTag, "displayMetrics must be set before calling setDeviceParams.");
                    return;
                }
                CardboardDevice$ScreenAlignmentMarker[] cardboardDevice$ScreenAlignmentMarkerArr = (CardboardDevice$ScreenAlignmentMarker[]) cardboardDevice$DeviceParams.daydreamInternal.getAlignmentMarkersList().toArray(new CardboardDevice$ScreenAlignmentMarker[0]);
                int length = cardboardDevice$ScreenAlignmentMarkerArr.length;
                this.markersInPixels = new float[length][];
                this.currentMarkerBestDists = new double[length];
                this.markerBestTouch = new int[length];
                for (length = 0; length < cardboardDevice$ScreenAlignmentMarkerArr.length; length++) {
                    float[] fArr = new float[]{fArr, ((float) (this.displayMetrics.widthPixels / 2)) + (cardboardDevice$ScreenAlignmentMarkerArr[length].getHorizontal() / this.xMetersPerPixel)};
                    this.markersInPixels[length][1] = ((float) this.displayMetrics.heightPixels) - (((cardboardDevice$ScreenAlignmentMarkerArr[length].getVertical() + cardboardDevice$DeviceParams.getTrayToLensDistance()) - this.borderSizeMeters) / this.yMetersPerPixel);
                }
                this.useRotationalAlignmentCorrection = cardboardDevice$DeviceParams.daydreamInternal.getUseRotationalAlignmentCorrection();
                return;
            }
        }
        Log.e(this.logTag, "Null deviceParams or no alignment markers found.");
        this.markersInPixels = null;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean viewerNeedsTouchProcessing() {
        if (this.enabled) {
            float[][] fArr = this.markersInPixels;
            if (fArr != null && fArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean processMotionEvent(MotionEvent motionEvent, float f, float f2) {
        MotionEvent motionEvent2 = motionEvent;
        if (viewerNeedsTouchProcessing()) {
            if (isDaydreamImageAlignmentEnabled()) {
                int i;
                int pointerCount = motionEvent.getPointerCount();
                if (pointerCount > this.mostTouchesSeen) {
                    this.touchBestMarker = new int[pointerCount];
                    this.mostTouchesSeen = pointerCount;
                }
                for (i = 0; i < this.markersInPixels.length; i++) {
                    this.markerBestTouch[i] = -1;
                    this.currentMarkerBestDists[i] = 2.25E-4d;
                }
                for (i = 0; i < pointerCount; i++) {
                    this.touchBestMarker[i] = -1;
                    double d = 2.25E-4d;
                    int i2 = 0;
                    while (true) {
                        float[][] fArr = this.markersInPixels;
                        if (i2 >= fArr.length) {
                            break;
                        }
                        float x = (fArr[i2][0] - (motionEvent2.getX(i) + 0.0f)) * this.xMetersPerPixel;
                        float y = (this.markersInPixels[i2][1] - (motionEvent2.getY(i) + 0.0f)) * this.yMetersPerPixel;
                        double d2 = (double) ((x * x) + (y * y));
                        if (d2 < d) {
                            this.touchBestMarker[i] = i2;
                            d = d2;
                        }
                        double[] dArr = this.currentMarkerBestDists;
                        if (d2 < dArr[i2]) {
                            dArr[i2] = d2;
                            this.markerBestTouch[i2] = i;
                        }
                        i2++;
                    }
                }
                i = 0;
                int i3 = 0;
                float f3 = 0.0f;
                float f4 = 0.0f;
                while (true) {
                    int[] iArr = this.markerBestTouch;
                    if (i >= iArr.length) {
                        break;
                    }
                    int i4 = iArr[i];
                    if (i4 != -1) {
                        if (this.touchBestMarker[i4] == i) {
                            i3++;
                            f3 += (motionEvent2.getX(i4) + 0.0f) - this.markersInPixels[i][0];
                            f4 += (motionEvent2.getY(this.markerBestTouch[i]) + 0.0f) - this.markersInPixels[i][1];
                        } else {
                            iArr[i] = -1;
                        }
                    }
                    i++;
                }
                float[] fArr2;
                if (i3 > 0) {
                    this.lastMotionEventInHeadset = true;
                    fArr2 = this.pixelTranslation;
                    float f5 = (float) i3;
                    fArr2[0] = f3 / f5;
                    fArr2[1] = f4 / f5;
                    f3 = fArr2[0];
                    float[] fArr3 = this.displayCutoutTranslation;
                    fArr2[0] = f3 + fArr3[0];
                    fArr2[1] = fArr2[1] + fArr3[1];
                } else {
                    this.lastMotionEventInHeadset = false;
                    fArr2 = this.pixelTranslation;
                    fArr2[0] = 0.0f;
                    fArr2[1] = 0.0f;
                }
                if (i3 == 2 && this.useRotationalAlignmentCorrection) {
                    this.rotation = getRotationRadians(motionEvent);
                } else {
                    this.rotation = 0.0f;
                }
                if (pointerCount > 0) {
                    pointerCount = this.angleSamplesReceived + 1;
                    this.angleSamplesReceived = pointerCount;
                    if (pointerCount == 200) {
                        logPhoneAlignment(motionEvent2, 0.0f, 0.0f);
                    }
                }
            }
            return true;
        }
        this.lastMotionEventInHeadset = false;
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public float getRotationRadians(MotionEvent motionEvent) {
        float[][] fArr = this.markersInPixels;
        if (fArr == null || fArr.length != 2) {
            Log.e(this.logTag, "No touch markers or the wrong number of touch markers.");
            return 0.0f;
        }
        double atan2 = Math.atan2((double) (motionEvent.getY(0) - motionEvent.getY(1)), (double) (motionEvent.getX(0) - motionEvent.getX(1)));
        float[][] fArr2 = this.markersInPixels;
        float[] fArr3 = fArr2[0];
        float f = fArr3[0];
        float[] fArr4 = fArr2[1];
        float atan22 = (float) (atan2 - Math.atan2((double) (fArr3[1] - fArr4[1]), (double) (f - fArr4[0])));
        if (((double) atan22) > 1.5707963267948966d) {
            atan22 -= 1.4292036f;
        }
        if (((double) atan22) < -1.5707963267948966d) {
            atan22 += 3.1415927f;
        }
        return atan22;
    }

    private void resetTrackingState() {
        this.lastMotionEventInHeadset = false;
        float[] fArr = this.pixelTranslation;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        this.rotation = 0.0f;
        this.mostTouchesSeen = 0;
    }

    private void logPhoneAlignment(MotionEvent motionEvent, float f, float f2) {
        anep anep;
        int pointerCount = motionEvent.getPointerCount();
        angf angf = new angf();
        anes anes = (anes) anep.e.createBuilder();
        int i = 0;
        while (i < pointerCount) {
            anfp anfp = (anfp) anfq.d.createBuilder();
            anfp.a(motionEvent.getX(i) + 0.0f);
            anfp.b(motionEvent.getY(i) + 0.0f);
            anfq anfq = (anfq) ((anxl) anfp.build());
            anes.copyOnWrite();
            anep = (anep) anes.instance;
            if (anfq != null) {
                if (!anep.b.a()) {
                    anep.b = anxl.mutableCopy(anep.b);
                }
                anep.b.add(anfq);
                i++;
            } else {
                throw new NullPointerException();
            }
        }
        anfp anfp2 = (anfp) anfq.d.createBuilder();
        anfp2.a(this.pixelTranslation[0]);
        anfp2.b(this.pixelTranslation[1]);
        anfq anfq2 = (anfq) ((anxl) anfp2.build());
        anes.copyOnWrite();
        anep = (anep) anes.instance;
        if (anfq2 != null) {
            anep.c = anfq2;
            anep.a |= 1;
            if (pointerCount == 2 && this.markersInPixels.length == 2) {
                double toDegrees = Math.toDegrees((double) getRotationRadians(motionEvent));
                anes.copyOnWrite();
                anep anep2 = (anep) anes.instance;
                anep2.a = 2 | anep2.a;
                anep2.d = (float) toDegrees;
                StringBuilder stringBuilder = new StringBuilder(58);
                stringBuilder.append("Phone angle in headset (degrees): ");
                stringBuilder.append(toDegrees);
                stringBuilder.toString();
                f = motionEvent.getX(0);
                float y = motionEvent.getY(0);
                StringBuilder stringBuilder2 = new StringBuilder(49);
                stringBuilder2.append("  Touch point 1: ");
                stringBuilder2.append(f + 0.0f);
                String str = ", ";
                stringBuilder2.append(str);
                stringBuilder2.append(y + 0.0f);
                stringBuilder2.toString();
                y = motionEvent.getX(1);
                float y2 = motionEvent.getY(1);
                stringBuilder2 = new StringBuilder(49);
                stringBuilder2.append("  Touch point 2: ");
                stringBuilder2.append(y + 0.0f);
                stringBuilder2.append(str);
                stringBuilder2.append(y2 + 0.0f);
                stringBuilder2.toString();
            }
            angf.a = (anep) ((anxl) anes.build());
            logEvent(andw.SDK_PHONE_ALIGNMENT, angf);
            return;
        }
        throw new NullPointerException();
    }
}
