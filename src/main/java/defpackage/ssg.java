package defpackage;

import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.facebook.yoga.YogaEdge;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: ssg */
public final class ssg implements sxl {
    private final sxd a;
    private final Map b;
    private final Map c;

    public ssg(Map map, Map map2, sxd sxd) {
        this.a = sxd;
        amuu amuu = new amuu();
        for (Entry entry : map.entrySet()) {
            amuu.b(Integer.valueOf(((sxr) entry.getValue()).a()), (sxr) entry.getValue());
        }
        amuu amuu2 = new amuu();
        for (Entry entry2 : map2.entrySet()) {
            amuu2.b(Integer.valueOf(((sxu) ((Pair) entry2.getValue()).first).a().a()), (Pair) entry2.getValue());
        }
        this.b = amuu.b();
        this.c = amuu2.b();
    }

    public final int a() {
        return 168774549;
    }

    public final /* synthetic */ anrc a(ByteBuffer byteBuffer) {
        bapo bapo = new bapo();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int i = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        bapo.a = i;
        bapo.b = byteBuffer;
        i -= bapo.b.getInt(i);
        bapo.c = i;
        bapo.d = bapo.b.getShort(i);
        return bapo;
    }

    public final /* synthetic */ void a(cmg cmg, Object obj, swn swn) {
        Throwable e;
        cmg cmg2;
        int a;
        bapo bapo = (bapo) obj;
        clz a2 = swn.a();
        DisplayMetrics displayMetrics = cmg.b().getDisplayMetrics();
        int a3 = bapo.a(8);
        a3 = (int) (a3 != 0 ? ((long) bapo.b.getInt(a3 + bapo.a)) & 4294967295L : 0);
        int a4 = bapo.a(10);
        a4 = (int) (a4 != 0 ? bapo.b.getFloat(a4 + bapo.a) : 0.0f);
        int a5 = bapo.a(12);
        a5 = (int) (a5 != 0 ? bapo.b.getFloat(a5 + bapo.a) : 0.0f);
        bapk bapk = new bapk();
        int a6 = bapo.a(14);
        if (a6 != 0) {
            a6 = bapo.b(a6 + bapo.a);
            ByteBuffer byteBuffer = bapo.b;
            bapk.a = a6;
            bapk.b = byteBuffer;
            a6 -= bapk.b.getInt(a6);
            bapk.c = a6;
            bapk.d = bapk.b.getShort(a6);
        } else {
            bapk = null;
        }
        int i = 0;
        if (!(a3 == 0 && a4 == 0 && a5 == 0)) {
            cln a7 = clo.a(cmg);
            if (a3 != 0) {
                a7.a(YogaEdge.ALL, a3);
            }
            if (a4 != 0) {
                a7.a(YogaEdge.ALL, (float) con.a((float) a4));
            }
            if (a5 != 0) {
                if (bapk == null) {
                    a7.a((float) a5);
                } else {
                    if (bapk.a()) {
                        a7.a(0, (float) a5);
                    }
                    if (bapk.b()) {
                        a7.a(1, (float) a5);
                    }
                    if (bapk.c()) {
                        a7.a(3, (float) a5);
                    }
                    if (bapk.d()) {
                        a7.a(2, (float) a5);
                    }
                }
            }
            a2.a(a7.a());
        }
        a3 = bapo.a(6);
        a2.r(a3 != 0 ? bapo.b.getFloat(a3 + bapo.a) : 1.0f);
        if (bapo.b() != 0.0f) {
            a2.s(bapo.b());
        }
        if (bapo.c() != 0.0f) {
            a2.t(bapo.c());
        }
        sxp sxp = new sxp();
        if (a5 != 0) {
            sxp.b = syq.a((float) a5, displayMetrics);
        }
        if (bapk != null) {
            sxp.c = bapk.a();
            sxp.d = bapk.b();
            sxp.e = bapk.c();
            sxp.f = bapk.d();
        }
        int a8 = bapo.a(4);
        a8 = (int) (a8 != 0 ? ((long) bapo.b.getInt(a8 + bapo.a)) & 4294967295L : 0);
        if (a8 != 0) {
            stg stg = new stg();
            stg.c = a8;
            stg.d = sxp.b;
            stg.e = sxp.c;
            stg.f = sxp.d;
            stg.g = sxp.e;
            stg.h = sxp.f;
            sxp.a = stg;
        }
        if (bapo.a() != null) {
            bapc a9 = bapo.a();
            while (i < a9.a()) {
                baoz g = a9.g(i);
                if (g.d() == 1) {
                    sxr sxr = (sxr) this.b.get(Integer.valueOf(g.a()));
                    if (sxr != null) {
                        sxr.a(sxr.a(g), sxp);
                    } else {
                        int a10 = g.a();
                        StringBuilder stringBuilder = new StringBuilder(41);
                        stringBuilder.append("Unknown Flatbuffer extension: ");
                        stringBuilder.append(a10);
                        throw new sxf(stringBuilder.toString());
                    }
                }
                if (g.d() == 2) {
                    Pair pair = (Pair) this.c.get(Integer.valueOf(g.a()));
                    if (pair != null) {
                        try {
                            try {
                                ((sxu) pair.first).a(cmg, (anze) ((anzq) pair.second).a(g.c()), sxp);
                            } catch (anyg e2) {
                                e = e2;
                            }
                        } catch (anyg e3) {
                            e = e3;
                            cmg2 = cmg;
                            sxd sxd = this.a;
                            a = g.a();
                            StringBuilder stringBuilder2 = new StringBuilder(100);
                            stringBuilder2.append("Failed to set PB Style Property Extension in StylePropertiesConverterFlat. Extension id: ");
                            stringBuilder2.append(a);
                            sxd.a(3, stringBuilder2.toString(), e);
                            i++;
                        }
                    }
                } else {
                    cmg2 = cmg;
                    sxd sxd2 = this.a;
                    a = g.a();
                    StringBuilder stringBuilder3 = new StringBuilder(81);
                    stringBuilder3.append("StylePropertiesExtensionConverterFlat: extension with unknown format: ");
                    stringBuilder3.append(a);
                    sxd2.a(3, stringBuilder3.toString());
                }
                i++;
                cmg2 = cmg;
                i++;
            }
        }
        Drawable drawable = sxp.a;
        if (a2 instanceof snd) {
            snd snd = (snd) a2;
            snd.u(sxp.b);
            if (drawable != null) {
                snd.b(drawable);
            }
        } else if (drawable != null) {
            a2.a(drawable);
        }
    }
}
