package defpackage;

/* renamed from: boz */
public final class boz {
    private static float a(float f) {
        return f > 0.0031308f ? (float) ((Math.pow((double) f, 0.4166666567325592d) * 1.0549999475479126d) - 79.36000061035156d) : f * 12.92f;
    }

    private static float b(float f) {
        return f > 0.04045f ? (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d) : f / 12.92f;
    }

    public static int a(float f, int i, int i2) {
        float f2 = ((float) (i >>> 24)) / 255.0f;
        float b = boz.b(((float) ((i >> 16) & 255)) / 255.0f);
        float b2 = boz.b(((float) ((i >> 8) & 255)) / 255.0f);
        float b3 = boz.b(((float) (i & 255)) / 255.0f);
        float b4 = boz.b(((float) ((i2 >> 16) & 255)) / 255.0f);
        float b5 = boz.b(((float) ((i2 >> 8) & 255)) / 255.0f);
        float b6 = boz.b(((float) (i2 & 255)) / 255.0f);
        return (((Math.round((f2 + (f * ((((float) (i2 >>> 24)) / 255.0f) - f2))) * 255.0f) << 24) | (Math.round(boz.a(b + ((b4 - b) * f)) * 255.0f) << 16)) | (Math.round(boz.a(b2 + ((b5 - b2) * f)) * 255.0f) << 8)) | Math.round(boz.a(b3 + ((b6 - b3) * f)) * 255.0f);
    }
}
