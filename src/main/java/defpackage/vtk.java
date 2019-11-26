package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.protos.youtube.api.innertube.BrandInteractionRendererOuterClass;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: vtk */
public final class vtk extends vsl {
    public static final Creator CREATOR = new vtn();
    public static final vsr c = new vtm();
    public final ayxm a;
    public final aakj b;

    @Deprecated
    public vtk(vsd vsd, aajj aajj, String str, ayxm ayxm, aajx aajx, aamj aamj, long j) {
        vsd vsd2 = vsd;
        aajj aajj2 = aajj;
        ayxm ayxm2 = ayxm;
        aajx aajx2 = aajx;
        aamj aamj2 = aamj;
        this(vsd2.f, vsd2.i, vsd2.h, vsd2.g, vsd2.e, str, vtk.a(vtk.a(ayxm2, aajx2, aamj2, aajj), ayxm2, j, vsd2.e), ayxm2, vtk.a(ayxm2, aajx2, aamj2, aajj));
    }

    public final boolean g() {
        return true;
    }

    public final boolean h() {
        return true;
    }

    public vtk(vsd vsd, String str, aakj aakj, ayxm ayxm, long j) {
        vsd vsd2 = vsd;
        String str2 = vsd2.f;
        byte[] bArr = vsd2.i;
        String str3 = vsd2.h;
        String str4 = vsd2.g;
        boolean z = vsd2.e;
        aakj aakj2 = aakj;
        ayxm ayxm2 = ayxm;
        this(str2, bArr, str3, str4, z, str, vtk.a(aakj, ayxm, j, z), ayxm2, aakj2);
    }

    public vtk(String str, byte[] bArr, String str2, String str3, boolean z, String str4, long j, ayxm ayxm, aakj aakj) {
        aojx aojx;
        ayxm ayxm2 = ayxm;
        aajj n = aakj.n();
        if ((ayxm2.a & 8) != 0) {
            aojx = ayxm2.e;
            if (aojx == null) {
                aojx = aojx.w;
            }
        } else {
            aojx = aojx.w;
        }
        vtp vtp = new vtp(aojx);
        super(str, bArr, str2, str3, z, n, str4, j, vtp);
        this.a = (ayxm) amqw.a((Object) ayxm);
        this.b = (aakj) amqw.a((Object) aakj);
    }

    private static aakj a(ayxm ayxm, aajx aajx, aamj aamj, aajj aajj) {
        aojg aojg = ayxm.c;
        if (aojg == null) {
            aojg = aojg.d;
        }
        if (aojg.b.size() != 0) {
            aojg = ayxm.c;
            if (aojg == null) {
                aojg = aojg.d;
            }
            aakj a = vsn.a(aajx, aojg, aajj);
            if (a != null) {
                return a;
            }
        }
        ajxu ajxu = (ajxu) aamj.a(ayxm.b.d(), ajxu.class);
        if (ajxu == null) {
            afpc.a(1, afpf.ad, "AdBreakRenderer path ad playerResponse cannot be deserialized.");
            ajxu = new ajxu();
        }
        return new aakj(ajxu, 0, aajx);
    }

    private static long a(aakj aakj, ayxm ayxm, long j, boolean z) {
        long toMillis;
        if (z) {
            aojm aojm = ayxm.h;
            if (aojm == null) {
                aojm = aojm.d;
            }
            aojk aojk = aojm.c;
            if (aojk == null) {
                aojk = aojk.c;
            }
            if ((aojk.a & 1) != 0) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                aojm aojm2 = ayxm.h;
                if (aojm2 == null) {
                    aojm2 = aojm.d;
                }
                aojk aojk2 = aojm2.c;
                if (aojk2 == null) {
                    aojk2 = aojk.c;
                }
                avmk avmk = aojk2.b;
                if (avmk == null) {
                    avmk = avmk.d;
                }
                toMillis = timeUnit.toMillis((long) avmk.c);
            } else {
                toMillis = m;
            }
            return j + toMillis;
        }
        aajs aajs = aakj.c;
        if (aajs != null) {
            toMillis = aajs.e;
            if (toMillis != Long.MAX_VALUE) {
                return toMillis + j;
            }
        }
        return Long.MAX_VALUE;
    }

    public final String d() {
        return this.b.b();
    }

    public final List J() {
        return this.a.m;
    }

    public final String K() {
        return this.a.l;
    }

    public final String e() {
        return !this.h ? this.b.z() : "";
    }

    public final int f() {
        return this.b.h();
    }

    /* Access modifiers changed, original: protected|final */
    public final int V() {
        return this.a.d;
    }

    public final aakj i() {
        return this.b;
    }

    public final ayxm T() {
        return this.a;
    }

    public final aajs j() {
        return this.b.c;
    }

    public final aakh k() {
        return this.b.m();
    }

    public final List L() {
        return this.a.i;
    }

    public final aule[] M() {
        ayxm ayxm = this.a;
        if ((ayxm.a & 256) == 0) {
            return null;
        }
        aojm aojm = ayxm.h;
        if (aojm == null) {
            aojm = aojm.d;
        }
        return (aule[]) aojm.b.toArray(new aule[0]);
    }

    public final Uri N() {
        anxp anxp = this.a.f;
        if (anxp == null) {
            anxp = apxu.d;
        }
        anxr access$000 = anxl.checkIsLite(UrlEndpointOuterClass.urlEndpoint);
        anxp.a(access$000);
        Object b = anxp.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        ayvl ayvl = (ayvl) b;
        if (ayvl.b.isEmpty()) {
            return null;
        }
        return Uri.parse(ayvl.b);
    }

    public final apxu O() {
        apxu apxu = this.a.f;
        return apxu == null ? apxu.d : apxu;
    }

    public final Uri l() {
        if (j() != null) {
            List list = j().l;
            if (list != null) {
                if (!list.isEmpty()) {
                    return ((aahr) list.get(0)).d;
                }
                afpc.a(1, afpf.ad, "Received non-null videoStreamingData object with empty list of format streams");
                return null;
            }
        }
        return null;
    }

    public final aolc m() {
        return this.b.o();
    }

    public final int P() {
        aojm aojm = this.a.h;
        if (aojm == null) {
            aojm = aojm.d;
        }
        aojk aojk = aojm.c;
        if (aojk == null) {
            aojk = aojk.c;
        }
        if ((aojk.a & 1) == 0) {
            return 1;
        }
        aojm = this.a.h;
        if (aojm == null) {
            aojm = aojm.d;
        }
        aojk = aojm.c;
        if (aojk == null) {
            aojk = aojk.c;
        }
        avmk avmk = aojk.b;
        if (avmk == null) {
            avmk = avmk.d;
        }
        return avmk.b;
    }

    public final ajwf n() {
        ajwj ajwj = this.b.a.m;
        return ajwj != null ? ajwj.a : null;
    }

    private final atrh X() {
        ayxk ayxk = this.a.j;
        if (ayxk == null) {
            ayxk = ayxk.c;
        }
        if ((ayxk.a & 1) == 0) {
            return null;
        }
        atrh atrh = ayxk.b;
        if (atrh == null) {
            atrh = atrh.j;
        }
        return atrh;
    }

    public final axop Q() {
        atrh X = X();
        if (X == null || (X.a & 1) == 0) {
            return null;
        }
        axak axak = X.b;
        if (axak == null) {
            axak = axak.a;
        }
        return (axop) ajzv.a(ajzv.a(axak), axop.class);
    }

    public final aphg R() {
        atrh X = X();
        if (X != null) {
            anxp anxp = X.h;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp anxp2 = X.h;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                anxr access$0002 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
                anxp2.a(access$0002);
                Object b = anxp2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                return (aphg) b;
            }
        }
        return null;
    }

    public final apfy S() {
        atrh X = X();
        if (X != null) {
            anxp anxp = X.c;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(BrandInteractionRendererOuterClass.brandInteractionRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp anxp2 = X.c;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                anxr access$0002 = anxl.checkIsLite(BrandInteractionRendererOuterClass.brandInteractionRenderer);
                anxp2.a(access$0002);
                Object b = anxp2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                return (apfy) b;
            }
        }
        return null;
    }

    public final apxu U() {
        atrh X = X();
        if (X != null) {
            anxp anxp = X.d;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$000);
            Object b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            aphg aphg = (aphg) b;
            if ((aphg.a & 4096) != 0) {
                apxu apxu = aphg.m;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                return apxu;
            }
        }
        return null;
    }

    public final aojz I() {
        aojz aojz = this.a.n;
        return aojz == null ? aojz.s : aojz;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vtk) {
            vtk vtk = (vtk) obj;
            if (super.equals(vtk) && amqq.a(this.a, vtk.a) && amqq.a(this.b, vtk.b)) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        xup.a(this.a, parcel);
        parcel.writeParcelable(this.b, 0);
    }

    public final /* synthetic */ afns c() {
        return new vtm(this);
    }
}
