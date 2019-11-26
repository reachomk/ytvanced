package defpackage;

import android.os.Handler;
import android.os.Parcelable;
import android.view.KeyEvent;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IControlsOverlayService;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: mxn */
public final class mxn extends mzi {
    public final aibb a;
    public final aigc b;
    public final aihv c;
    public final aifc d;
    public final muz e;
    public myp f;
    private final Handler g;

    public mxn(aibb aibb, aigc aigc, aihv aihv, aifc aifc, muz muz, Handler handler) {
        this.a = (aibb) amqw.a((Object) aibb);
        this.b = (aigc) amqw.a((Object) aigc);
        this.c = (aihv) amqw.a((Object) aihv);
        this.d = (aifc) amqw.a((Object) aifc);
        this.e = (muz) amqw.a((Object) muz);
        this.g = (Handler) amqw.a((Object) handler);
    }

    public final void a() {
        myp myp = this.f;
        if (myp != null) {
            myp.a = null;
            this.f = null;
        }
    }

    public final void a(IControlsOverlayService iControlsOverlayService) {
        this.g.post(new mxm(this, iControlsOverlayService));
    }

    public final void a(aicd aicd) {
        this.g.post(new mxp(this, aicd));
    }

    public final void a(boolean z) {
        this.g.post(new mxy(this, z));
    }

    public final void a(aajq[] aajqArr, int i) {
        this.g.post(new myg(this, aajqArr, i));
    }

    public final void b(boolean z) {
        this.g.post(new myj(this, z));
    }

    public final void c(boolean z) {
        this.g.post(new myi(this, z));
    }

    public final void d(boolean z) {
        this.g.post(new myl(this, z));
    }

    public final void e(boolean z) {
        this.g.post(new myk(this, z));
    }

    public final void b() {
        this.g.post(new myn(this));
    }

    public final void c() {
        this.g.post(new mym(this));
    }

    public final void a(aich aich) {
        this.g.post(new mxo(this, aich));
    }

    public final void a(String str, boolean z) {
        this.g.post(new mxr(this, str, z));
    }

    public final void f(boolean z) {
        this.g.post(new mxq(this, z));
    }

    public final void a(long j, long j2, long j3, long j4) {
        this.g.post(new mxt(this, j, j2, j3, j4));
    }

    public final void d() {
        this.g.post(new mxs(this));
    }

    public final void e() {
        this.g.post(new mxv(this));
    }

    public final boolean a(int i, KeyEvent keyEvent) {
        this.g.post(new mxu(this, i, keyEvent));
        return true;
    }

    public final boolean b(int i, KeyEvent keyEvent) {
        this.g.post(new mxx(this, i, keyEvent));
        return true;
    }

    public final void g(boolean z) {
        this.g.post(new mxw(this, z));
    }

    public final void f() {
        this.g.post(new mxz(this));
    }

    public final void h(boolean z) {
        this.g.post(new myb(this, z));
    }

    public final void a(ajis ajis) {
        this.g.post(new mya(this, ajis));
    }

    public final void a(List list) {
        this.g.post(new myd(this, list));
    }

    public final void i(boolean z) {
        this.g.post(new myc(this, z));
    }

    public final void a(String str) {
        this.g.post(new myf(this, str));
    }

    public final void j(boolean z) {
        this.g.post(new mye(this, z));
    }

    public final void a(Map map) {
        HashMap hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            try {
                aihu aihu = (aihu) entry.getKey();
                Parcelable[] parcelableArr = (Parcelable[]) entry.getValue();
                hashMap.put(aihu, (aihs[]) Arrays.copyOf(parcelableArr, parcelableArr.length, aihs[].class));
            } catch (ClassCastException unused) {
            }
        }
        this.g.post(new myh(this, hashMap));
    }
}
