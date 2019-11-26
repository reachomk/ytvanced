package defpackage;

import java.io.EOFException;

/* renamed from: ope */
final class ope {
    public ofm a;
    private final ofm[] b;

    public ope(ofm[] ofmArr) {
        this.b = ofmArr;
    }

    public final ofm a(ofp ofp, ofo ofo) {
        ofm ofm = this.a;
        if (ofm != null) {
            return ofm;
        }
        ofm[] ofmArr = this.b;
        int length = ofmArr.length;
        int i = 0;
        while (i < length) {
            ofm ofm2 = ofmArr[i];
            try {
                if (ofm2.a(ofp)) {
                    this.a = ofm2;
                    ofp.a();
                    break;
                }
                ofp.a();
                i++;
            } catch (EOFException unused) {
            } catch (Throwable th) {
                ofp.a();
            }
        }
        ofm ofm3 = this.a;
        if (ofm3 != null) {
            ofm3.a(ofo);
            return this.a;
        }
        String b = ozp.b(this.b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(b).length() + 58);
        stringBuilder.append("None of the available extractors (");
        stringBuilder.append(b);
        stringBuilder.append(") could read the stream.");
        throw new oqb(stringBuilder.toString());
    }
}
