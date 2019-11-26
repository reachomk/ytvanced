package defpackage;

import java.lang.reflect.Constructor;

/* renamed from: ofk */
public final class ofk implements ofr {
    private static final Constructor a;
    private final int b = 1;

    public final synchronized ofm[] a() {
        ofm[] ofmArr;
        ofmArr = new ofm[(a == null ? 13 : 14)];
        ofmArr[0] = new ogn(0);
        ofmArr[1] = new ohk((byte) 0);
        ofmArr[2] = new ohq((byte) 0);
        ofmArr[3] = new ogv((byte) 0);
        ofmArr[4] = new oiy((byte) 0);
        ofmArr[5] = new oiu();
        ofmArr[6] = new okc(this.b);
        ofmArr[7] = new ogc();
        ofmArr[8] = new oif();
        ofmArr[9] = new ojv();
        ofmArr[10] = new okm();
        ofmArr[11] = new oga((byte) 0);
        ofmArr[12] = new oiw();
        if (a != null) {
            try {
                ofmArr[13] = (ofm) a.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }
        return ofmArr;
    }

    static {
        Constructor constructor;
        try {
            constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(ofm.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
            constructor = null;
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        a = constructor;
    }
}
