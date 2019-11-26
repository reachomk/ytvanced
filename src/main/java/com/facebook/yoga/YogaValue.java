package com.facebook.yoga;

public class YogaValue {
    public final float a;
    private final YogaUnit b;

    private YogaValue(float f, YogaUnit yogaUnit) {
        this.a = f;
        this.b = yogaUnit;
    }

    YogaValue(float f, int i) {
        this(f, YogaUnit.a(i));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof YogaValue) {
            YogaValue yogaValue = (YogaValue) obj;
            YogaUnit yogaUnit = this.b;
            if (yogaUnit == yogaValue.b) {
                if (yogaUnit == YogaUnit.UNDEFINED || this.b == YogaUnit.AUTO || Float.compare(this.a, yogaValue.a) == 0) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a) + this.b.d;
    }

    public final String toString() {
        int ordinal = this.b.ordinal();
        if (ordinal == 0) {
            return "undefined";
        }
        if (ordinal == 1) {
            return Float.toString(this.a);
        }
        if (ordinal == 2) {
            float f = this.a;
            StringBuilder stringBuilder = new StringBuilder(16);
            stringBuilder.append(f);
            stringBuilder.append("%");
            return stringBuilder.toString();
        } else if (ordinal == 3) {
            return "auto";
        } else {
            throw new IllegalStateException();
        }
    }

    static {
        YogaValue yogaValue = new YogaValue(Float.NaN, YogaUnit.UNDEFINED);
        yogaValue = new YogaValue(0.0f, YogaUnit.POINT);
        yogaValue = new YogaValue(Float.NaN, YogaUnit.AUTO);
    }
}
