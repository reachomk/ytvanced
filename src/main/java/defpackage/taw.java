package defpackage;

import android.content.Context;
import android.view.MotionEvent;

/* renamed from: taw */
public final class taw extends tat {
    public final String a(Context context, byte[] bArr) {
        return this.a.a(context, bArr);
    }

    public final void a(tba tba) {
        if (tba != null) {
            try {
                this.a.a(new pcy(((vnh) tba).a, ((vnh) tba).b));
                return;
            } catch (pbx e) {
                throw new tau(e);
            }
        }
        this.a.a(null);
    }

    public final String a(Context context, String str) {
        return this.a.a.a(qct.a((Object) context), str);
    }

    public final void a(MotionEvent motionEvent) {
        this.a.a.d(qct.a((Object) motionEvent));
    }

    public final /* bridge */ /* synthetic */ String a() {
        return this.a.a.a();
    }

    /* synthetic */ taw(String str, Context context, boolean z) {
        super(new pbq(str, context, z));
    }
}
