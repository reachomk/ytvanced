package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedImageClientService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLoggerCoordinator;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.PrimitiveAdOverlayAdapter;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.RemoteDataBus;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.SelectableItemRegistry;
import java.util.List;

/* renamed from: ngh */
public final class ngh extends mvs {
    public final mmk B;
    public final EmbedInteractionLoggerCoordinator C;
    public final int D;
    private final mlp E;
    private final SelectableItemRegistry F;
    private final EmbedImageClientService G;
    private final RemoteDataBus H = new RemoteDataBus(this.b);

    public ngh(Activity activity, mlp mlp, afjt afjt) {
        Activity activity2 = activity;
        Object obj = mlp;
        Context context = activity;
        mlp mlp2 = mlp;
        afjt afjt2 = afjt;
        super(activity2, new msh(activity2), new aiuf(activity2));
        this.E = (mlp) amqw.a(obj, (Object) "apiEnvironment cannot be null");
        this.d.b((View) afjt);
        this.i.a(new ngk());
        this.G = new EmbedImageClientService(this.c, obj.f.i(), mlp.b());
        this.F = new SelectableItemRegistry();
        ngj ngj = r5;
        ngj ngj2 = new ngj(this);
        aiuf aiuf = this.d;
        PrimitiveAdOverlayAdapter primitiveAdOverlayAdapter = r8;
        PrimitiveAdOverlayAdapter primitiveAdOverlayAdapter2 = new PrimitiveAdOverlayAdapter(this.n, obj.f.oF(), mlp.b());
        mmk mmk = r1;
        mmk mmk2 = new mmk(context, ngj, mlp2, aiuf, afjt2, primitiveAdOverlayAdapter, this.o, this.e, this.i, this.k, this.F, this.f, this.g, this.h, this.p, this.q, this.r, this.m, this.H, amky.b);
        this.B = mmk;
        this.C = mlp.f.f();
        int a = this.C.a(System.identityHashCode(activity));
        this.D = a;
        this.C.c(a);
        this.l.a(this.c, this.F);
    }

    public final boolean K() {
        return this.B.k();
    }

    public final void c(String str, int i) {
        this.C.a(this.D, msf.a(str, (long) i), true);
        this.B.a(str, i, this.D);
    }

    public final void d(String str, int i) {
        this.C.a(this.D, msf.a(str, (long) i), true);
        this.B.a(str, false, i, false, this.D);
    }

    public final void c(String str, int i, int i2) {
        this.C.a(this.D, msf.a(str, i, (long) i2), true);
        this.B.a(str, i, i2, this.D);
    }

    public final void d(String str, int i, int i2) {
        this.C.a(this.D, msf.a(str, i, (long) i2), true);
        this.B.a(str, i, i2, false, this.D);
    }

    public final void c(List list, int i, int i2) {
        this.C.a(this.D, msf.a(list, i, (long) i2), true);
        this.B.a(list, i, i2, this.D);
    }

    public final void d(List list, int i, int i2) {
        this.C.a(this.D, msf.a(list, i, (long) i2), true);
        this.B.a(list, i, i2, false, this.D);
    }

    public final void y() {
        this.B.b();
    }

    public final void z() {
        this.B.c();
    }

    public final void A() {
        this.B.j();
    }

    public final boolean B() {
        return this.B.c;
    }

    public final boolean C() {
        return this.B.d();
    }

    public final boolean D() {
        return this.B.e();
    }

    public final void E() {
        this.B.f();
    }

    public final void F() {
        this.B.g();
    }

    public final int G() {
        if (this.B.h() < -2147483648L || this.B.h() > 2147483647L) {
            long h = this.B.h();
            StringBuilder stringBuilder = new StringBuilder(42);
            stringBuilder.append("32 bit time overflow: ");
            stringBuilder.append(h);
            xtl.d(stringBuilder.toString());
        }
        return (int) this.B.h();
    }

    public final int H() {
        if (this.B.i() < -2147483648L || this.B.i() > 2147483647L) {
            long i = this.B.i();
            StringBuilder stringBuilder = new StringBuilder(42);
            stringBuilder.append("32 bit time overflow: ");
            stringBuilder.append(i);
            xtl.d(stringBuilder.toString());
        }
        return (int) this.B.i();
    }

    public final void e(int i) {
        this.B.a(i);
    }

    public final void f(int i) {
        this.B.b(i);
    }

    public final void f(boolean z) {
        this.B.b(z);
    }

    /* Access modifiers changed, original: protected|final */
    public final void g(boolean z) {
        this.B.a(z);
    }

    public final void J() {
        this.B.l();
    }

    public final void h(boolean z) {
        this.B.c(z);
    }

    public final void I() {
        this.B.m();
    }

    public final void i(boolean z) {
        this.B.e(z);
    }

    public final boolean c(int i, KeyEvent keyEvent) {
        return this.B.a(i, keyEvent);
    }

    public final boolean d(int i, KeyEvent keyEvent) {
        return this.B.b(i, keyEvent);
    }

    public final void j(boolean z) {
        this.B.d(z);
        this.C.b(this.D);
        this.H.a();
        this.G.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final byte[] x() {
        ajcp o = this.B.o();
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(o, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        this.B.a((ajcp) obtain.readParcelable(ajcp.class.getClassLoader()));
        obtain.recycle();
        return true;
    }

    public final void M() {
        this.B.n();
    }

    public final void N() {
        this.B.a();
    }

    public final void a(acwc acwc) {
        this.C.a(acwc);
    }

    public final void L() {
        if (!TextUtils.isEmpty(this.z) && mrp.a(this.s)) {
            this.C.b(acwc.PLAYER_YOU_TUBE_BUTTON);
            Context context = this.s;
            String str = this.z;
            mlp mlp = this.E;
            mni mni = mlp.b;
            String str2 = mni.a;
            String str3 = mni.b;
            String str4 = mlp.c;
            Bundle bundle = new Bundle(3);
            bundle.putString("app_package", str2);
            bundle.putString("app_version", str3);
            bundle.putString("client_library_version", str4);
            context.startActivity(mrp.a(context, str, bundle));
        }
    }

    static {
        xtl.a("YouTubeAndroidPlayerAPI");
    }
}
