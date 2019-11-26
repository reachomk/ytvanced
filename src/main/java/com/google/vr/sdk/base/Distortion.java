package com.google.vr.sdk.base;

import java.util.Arrays;

public class Distortion {
    public static final float[] CARDBOARD_V1_COEFFICIENTS = new float[]{0.441f, 0.156f};
    public static final float[] CARDBOARD_V2_2_COEFFICIENTS = new float[]{0.34f, 0.55f};
    public float[] coefficients;

    public Distortion() {
        this.coefficients = (float[]) CARDBOARD_V2_2_COEFFICIENTS.clone();
    }

    public Distortion(Distortion distortion) {
        setCoefficients(distortion.coefficients);
    }

    public static Distortion parseFromProtobuf(float[] fArr) {
        Distortion distortion = new Distortion();
        distortion.setCoefficients(fArr);
        return distortion;
    }

    public float[] toProtobuf() {
        return (float[]) this.coefficients.clone();
    }

    public void setCoefficients(float[] fArr) {
        this.coefficients = fArr == null ? new float[0] : (float[]) fArr.clone();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Distortion)) {
            return false;
        }
        return Arrays.equals(this.coefficients, ((Distortion) obj).coefficients);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\n  coefficients: [");
        int i = 0;
        while (true) {
            float[] fArr = this.coefficients;
            if (i < fArr.length) {
                stringBuilder.append(Float.toString(fArr[i]));
                if (i < this.coefficients.length - 1) {
                    stringBuilder.append(", ");
                }
                i++;
            } else {
                stringBuilder.append("],\n}");
                return stringBuilder.toString();
            }
        }
    }
}
