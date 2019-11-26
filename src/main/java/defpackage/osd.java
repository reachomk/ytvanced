package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: osd */
public final class osd extends ori {
    private final osg a;

    public osd(List list) {
        super("DvbDecoder");
        oza oza = new oza((byte[]) list.get(0));
        this.a = new osg(oza.e(), oza.e());
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ ork a(byte[] bArr, int i, boolean z) {
        oso oso;
        int i2;
        int c;
        int c2;
        int c3;
        int c4;
        int c5;
        SparseArray sparseArray;
        List emptyList;
        if (z) {
            oso oso2 = this.a.f;
            oso2.c.clear();
            oso2.d.clear();
            oso2.e.clear();
            oso2.f.clear();
            oso2.g.clear();
            oso2.h = null;
            oso2.i = null;
        }
        osg osg = this.a;
        oyx oyx = new oyx(bArr, i);
        while (true) {
            boolean z2 = true;
            if (oyx.a() < 48 || oyx.c(8) != 15) {
                oso = osg.f;
            } else {
                oso oso3 = osg.f;
                int c6 = oyx.c(8);
                i2 = 16;
                int c7 = oyx.c(16);
                int c8 = oyx.c(16);
                c = oyx.c() + c8;
                if ((c8 << 3) > oyx.a()) {
                    oyp.a("DvbParser", "Data field length exceeds limit");
                    oyx.b(oyx.a());
                } else {
                    int i3;
                    int c9;
                    int c10;
                    int c11;
                    switch (c6) {
                        case 16:
                            if (c7 == oso3.a) {
                                osk osk = oso3.i;
                                i3 = 8;
                                oyx.c(8);
                                int c12 = oyx.c(4);
                                c2 = oyx.c(2);
                                oyx.b(2);
                                c8 -= 2;
                                SparseArray sparseArray2 = new SparseArray();
                                while (c8 > 0) {
                                    c6 = oyx.c(i3);
                                    oyx.b(i3);
                                    c8 -= 6;
                                    sparseArray2.put(c6, new osj(oyx.c(16), oyx.c(16)));
                                    i3 = 8;
                                }
                                osk osk2 = new osk(c12, c2, sparseArray2);
                                if (osk2.b == 0) {
                                    if (!(osk == null || osk.a == osk2.a)) {
                                        oso3.i = osk2;
                                        break;
                                    }
                                }
                                oso3.i = osk2;
                                oso3.c.clear();
                                oso3.d.clear();
                                oso3.e.clear();
                                break;
                            }
                            break;
                        case 17:
                            osk osk3 = oso3.i;
                            if (c7 == oso3.a && osk3 != null) {
                                c9 = oyx.c(8);
                                oyx.b(4);
                                boolean e = oyx.e();
                                oyx.b(3);
                                c3 = oyx.c(16);
                                c4 = oyx.c(16);
                                oyx.c(3);
                                c10 = oyx.c(3);
                                oyx.b(2);
                                c11 = oyx.c(8);
                                int c13 = oyx.c(8);
                                int c14 = oyx.c(4);
                                int c15 = oyx.c(2);
                                oyx.b(2);
                                c8 -= 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (c8 > 0) {
                                    c6 = oyx.c(i2);
                                    c7 = oyx.c(2);
                                    oyx.c(2);
                                    c5 = oyx.c(12);
                                    oyx.b(4);
                                    i2 = oyx.c(12);
                                    c8 -= 6;
                                    if (c7 == 1 || c7 == 2) {
                                        oyx.c(8);
                                        oyx.c(8);
                                        c8 -= 2;
                                    }
                                    sparseArray3.put(c6, new osl(c5, i2));
                                    i2 = 16;
                                }
                                osm osm = new osm(c9, e, c3, c4, c10, c11, c13, c14, c15, sparseArray3);
                                if (osk3.b == 0) {
                                    osm osm2 = (osm) oso3.c.get(osm.a);
                                    if (osm2 != null) {
                                        sparseArray = osm2.j;
                                        for (i3 = 0; i3 < sparseArray.size(); i3++) {
                                            osm.j.put(sparseArray.keyAt(i3), (osl) sparseArray.valueAt(i3));
                                        }
                                    }
                                }
                                oso3.c.put(osm.a, osm);
                                break;
                            }
                            break;
                        case 18:
                            osf a;
                            if (c7 != oso3.a) {
                                if (c7 == oso3.b) {
                                    a = osg.a(oyx, c8);
                                    oso3.f.put(a.a, a);
                                    break;
                                }
                            }
                            a = osg.a(oyx, c8);
                            oso3.d.put(a.a, a);
                            break;
                            break;
                        case 19:
                            osh a2;
                            if (c7 != oso3.a) {
                                if (c7 == oso3.b) {
                                    a2 = osg.a(oyx);
                                    oso3.g.put(a2.a, a2);
                                    break;
                                }
                            }
                            a2 = osg.a(oyx);
                            oso3.e.put(a2.a, a2);
                            break;
                            break;
                        case 20:
                            if (c7 == oso3.a) {
                                oyx.b(4);
                                boolean e2 = oyx.e();
                                oyx.b(3);
                                c9 = oyx.c(16);
                                int c16 = oyx.c(16);
                                if (e2) {
                                    c2 = oyx.c(16);
                                    c4 = oyx.c(16);
                                    c10 = oyx.c(16);
                                    c11 = oyx.c(16);
                                    c3 = c2;
                                } else {
                                    c4 = c9;
                                    c11 = c16;
                                    c3 = 0;
                                    c10 = 0;
                                }
                                oso3.h = new osi(c9, c16, c3, c4, c10, c11);
                                break;
                            }
                            break;
                    }
                    c -= oyx.c();
                    if (oyx.c != 0) {
                        z2 = false;
                    }
                    oxz.b(z2);
                    oyx.b += c;
                    oyx.g();
                }
            }
        }
        oso = osg.f;
        osn osn;
        osn osn2;
        if (oso.i == null) {
            emptyList = Collections.emptyList();
            osn = osn2;
        } else {
            osn osn3;
            osi osi = oso.h;
            if (osi == null) {
                osi = osg.d;
            }
            Bitmap bitmap = osg.g;
            if (!(bitmap != null && osi.a + 1 == bitmap.getWidth() && osi.b + 1 == osg.g.getHeight())) {
                osg.g = Bitmap.createBitmap(osi.a + 1, osi.b + 1, Config.ARGB_8888);
                osg.c.setBitmap(osg.g);
            }
            ArrayList arrayList = new ArrayList();
            sparseArray = osg.f.i.c;
            int i4 = 0;
            while (i4 < sparseArray.size()) {
                SparseArray sparseArray4;
                int i5;
                int i6;
                osg.c.save();
                osj osj = (osj) sparseArray.valueAt(i4);
                osm osm3 = (osm) osg.f.c.get(sparseArray.keyAt(i4));
                i2 = osj.a + osi.c;
                c2 = osj.b + osi.e;
                osg.c.clipRect(i2, c2, Math.min(osm3.c + i2, osi.d), Math.min(osm3.d + c2, osi.f));
                osf osf = (osf) osg.f.d.get(osm3.f);
                if (osf == null) {
                    osf = (osf) osg.f.f.get(osm3.f);
                    if (osf == null) {
                        osf = osg.e;
                    }
                }
                SparseArray sparseArray5 = osm3.j;
                c = 0;
                while (c < sparseArray5.size()) {
                    SparseArray sparseArray6;
                    int keyAt = sparseArray5.keyAt(c);
                    osl osl = (osl) sparseArray5.valueAt(c);
                    osh osh = (osh) osg.f.e.get(keyAt);
                    if (osh == null) {
                        osh = (osh) osg.f.g.get(keyAt);
                    }
                    if (osh == null) {
                        osn3 = osn2;
                        sparseArray4 = sparseArray;
                        i5 = i4;
                        sparseArray6 = sparseArray5;
                    } else {
                        int[] iArr;
                        Paint paint = !osh.b ? osg.a : null;
                        i6 = osm3.e;
                        sparseArray4 = sparseArray;
                        c5 = osl.a + i2;
                        int i7 = osl.b + c2;
                        sparseArray6 = sparseArray5;
                        Canvas canvas = osg.c;
                        osn3 = osn2;
                        if (i6 == 3) {
                            iArr = osf.d;
                        } else if (i6 != 2) {
                            iArr = osf.b;
                        } else {
                            iArr = osf.c;
                        }
                        i5 = i4;
                        int[] iArr2 = iArr;
                        c3 = i6;
                        c4 = c5;
                        Paint paint2 = paint;
                        Canvas canvas2 = canvas;
                        osg.a(osh.c, iArr2, c3, c4, i7, paint2, canvas2);
                        osg.a(osh.d, iArr2, c3, c4, i7 + 1, paint2, canvas2);
                    }
                    c++;
                    sparseArray = sparseArray4;
                    sparseArray5 = sparseArray6;
                    osn2 = osn3;
                    i4 = i5;
                }
                osn3 = osn2;
                sparseArray4 = sparseArray;
                i5 = i4;
                if (osm3.b) {
                    i6 = osm3.e;
                    if (i6 == 3) {
                        i6 = osf.d[osm3.g];
                    } else if (i6 != 2) {
                        i6 = osf.b[osm3.i];
                    } else {
                        i6 = osf.c[osm3.h];
                    }
                    osg.b.setColor(i6);
                    osg.c.drawRect((float) i2, (float) c2, (float) (osm3.c + i2), (float) (osm3.d + c2), osg.b);
                }
                Bitmap.createBitmap(osg.g, i2, c2, osm3.c, osm3.d);
                arrayList.add(new orf(((float) i2) / ((float) osi.a), 0, ((float) c2) / ((float) osi.b)));
                osg.c.drawColor(0, Mode.CLEAR);
                osg.c.restore();
                i4 = i5 + 1;
                sparseArray = sparseArray4;
                osn2 = osn3;
            }
            osn3 = osn2;
            emptyList = Collections.unmodifiableList(arrayList);
            osn = osn3;
        }
        return new osn(emptyList);
    }
}
