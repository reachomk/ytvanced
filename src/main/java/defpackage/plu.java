package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: plu */
public final class plu extends qou {
    public static final Creator CREATOR = new pnh();
    public static final List a = Arrays.asList(new String[]{"com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK", "com.google.android.gms.cast.framework.action.STOP_CASTING"});
    public static final int[] b = new int[]{0, 1};
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final pmw G;
    private final int[] H;
    public final List c;
    public final long d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public plu(List list, int[] iArr, long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, IBinder iBinder) {
        int[] iArr2 = iArr;
        IBinder iBinder2 = iBinder;
        pmw pmw = null;
        if (list != null) {
            this.c = new ArrayList(list);
        } else {
            this.c = null;
        }
        if (iArr2 != null) {
            this.H = Arrays.copyOf(iArr, iArr2.length);
        } else {
            this.H = null;
        }
        this.d = j;
        this.e = str;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = i8;
        this.n = i9;
        this.o = i10;
        this.p = i11;
        this.q = i12;
        this.r = i13;
        this.s = i14;
        this.t = i15;
        this.u = i16;
        this.v = i17;
        this.w = i18;
        this.x = i19;
        this.y = i20;
        this.z = i21;
        this.A = i22;
        this.B = i23;
        this.C = i24;
        this.D = i25;
        this.E = i26;
        this.F = i27;
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            if (queryLocalInterface instanceof pmw) {
                pmw = (pmw) queryLocalInterface;
            } else {
                pmw = new pmz(iBinder2);
            }
        }
        this.G = pmw;
    }

    public final int[] a() {
        int[] iArr = this.H;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.c);
        qov.a(parcel, 3, a());
        qov.a(parcel, 4, this.d);
        qov.a(parcel, 5, this.e);
        qov.b(parcel, 6, this.f);
        qov.b(parcel, 7, this.g);
        qov.b(parcel, 8, this.h);
        qov.b(parcel, 9, this.i);
        qov.b(parcel, 10, this.j);
        qov.b(parcel, 11, this.k);
        qov.b(parcel, 12, this.l);
        qov.b(parcel, 13, this.m);
        qov.b(parcel, 14, this.n);
        qov.b(parcel, 15, this.o);
        qov.b(parcel, 16, this.p);
        qov.b(parcel, 17, this.q);
        qov.b(parcel, 18, this.r);
        qov.b(parcel, 19, this.s);
        qov.b(parcel, 20, this.t);
        qov.b(parcel, 21, this.u);
        qov.b(parcel, 22, this.v);
        qov.b(parcel, 23, this.w);
        qov.b(parcel, 24, this.x);
        qov.b(parcel, 25, this.y);
        qov.b(parcel, 26, this.z);
        qov.b(parcel, 27, this.A);
        qov.b(parcel, 28, this.B);
        qov.b(parcel, 29, this.C);
        qov.b(parcel, 30, this.D);
        qov.b(parcel, 31, this.E);
        qov.b(parcel, 32, this.F);
        pmw pmw = this.G;
        qov.a(parcel, 33, pmw != null ? pmw.asBinder() : null);
        qov.a(parcel, i);
    }
}
