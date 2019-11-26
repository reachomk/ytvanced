package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import java.io.InputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: aekh */
final class aekh extends npi {
    private String a;
    private String b;
    private boolean c;
    private String d;
    private String e;
    private long f;
    private long g;
    private List h;

    aekh(String str) {
        super(str);
    }

    public final npf a(String str, InputStream inputStream) {
        return super.b(str, inputStream);
    }

    /* Access modifiers changed, original: protected|final */
    public final Pair a(XmlPullParser xmlPullParser, String str, long j) {
        try {
            this.f = npi.a(xmlPullParser, "yt:segmentIngestTime");
        } catch (ParseException unused) {
            this.f = -1;
        }
        this.h = new ArrayList();
        return super.a(xmlPullParser, str, j);
    }

    /* Access modifiers changed, original: protected|final */
    public final List c(XmlPullParser xmlPullParser) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ArrayList arrayList = new ArrayList();
        long j = 0;
        while (true) {
            xmlPullParser.next();
            if (nxc.b(xmlPullParser2, "S")) {
                j = npi.b(xmlPullParser2, "t", j);
                long j2 = j - this.g;
                long b = npi.b(xmlPullParser2, "yt:cuepointTimeOffset", Long.MIN_VALUE);
                Object obj = null;
                if (b != Long.MIN_VALUE) {
                    long b2 = npi.b(xmlPullParser2, "yt:cuepointDuration", Long.MIN_VALUE);
                    if (b2 != Long.MIN_VALUE) {
                        obj = new aets(npi.a(xmlPullParser2, "yt:cuepointIdentifier", null), npi.a(xmlPullParser2, "yt:cuepointEvent", null), j2, b, b2, npi.a(xmlPullParser2, "yt:cuepointContext", null));
                    }
                }
                if (obj != null) {
                    this.h.add(obj);
                }
                long b3 = npi.b(xmlPullParser2, "d");
                int i = 0;
                int a = npi.a(xmlPullParser2, "r", 0) + 1;
                while (i < a) {
                    arrayList.add(npi.a(j, b3));
                    j += b3;
                    i++;
                }
            }
            if (nxc.a(xmlPullParser2, "SegmentTimeline")) {
                return arrayList;
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final nps a(XmlPullParser xmlPullParser, nps nps) {
        this.g = npi.b(xmlPullParser, "presentationTimeOffset", 0);
        return super.a(xmlPullParser, nps);
    }

    /* Access modifiers changed, original: protected|final */
    public final npk a(String str, long j, List list) {
        for (aets aets : this.h) {
            aets.a = j;
        }
        return new aeki(j, list, this.f, this.h);
    }

    /* Access modifiers changed, original: protected|final */
    public final npe a(XmlPullParser xmlPullParser, String str, npn npn) {
        this.a = xmlPullParser.getAttributeValue(null, "yt:audioContentID");
        this.b = xmlPullParser.getAttributeValue(null, "yt:langName");
        this.c = false;
        this.d = xmlPullParser.getAttributeValue(null, "yt:projectionType");
        this.e = xmlPullParser.getAttributeValue(null, "yt:stereoLayout");
        return super.a(xmlPullParser, str, npn);
    }

    /* Access modifiers changed, original: protected|final */
    public final npe a(int i, int i2, List list, List list2) {
        return new aekg(i2, list, list2, this.a, this.b, this.c, this.d, this.e);
    }

    /* Access modifiers changed, original: protected|final */
    public final npd a(XmlPullParser xmlPullParser) {
        SparseArray sparseArray = new SparseArray();
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        do {
            xmlPullParser.next();
            if (nxc.b(xmlPullParser, "yt:SystemURL")) {
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
                if ("widevine".equals(attributeValue2)) {
                    xmlPullParser.next();
                    sparseArray.put(4, xmlPullParser.getText());
                } else if ("playready".equals(attributeValue2)) {
                    xmlPullParser.next();
                    sparseArray.put(5, xmlPullParser.getText());
                }
            }
        } while (!nxc.a(xmlPullParser, "ContentProtection"));
        return new aekf(attributeValue, sparseArray);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(XmlPullParser xmlPullParser) {
        if (nxc.b(xmlPullParser, "Role")) {
            if ("main".equals(xmlPullParser.getAttributeValue(null, "value"))) {
                this.c = true;
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final nom a(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, String str4) {
        return new aajy(str, str2, i, i2, f, i3, i4, i5, str3, str4);
    }

    public final /* synthetic */ Object b(String str, InputStream inputStream) {
        return super.b(str, inputStream);
    }
}
