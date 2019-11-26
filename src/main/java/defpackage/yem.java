package defpackage;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.libraries.youtube.conversation.ui.HeartView;

/* renamed from: yem */
public final class yem implements akmz, yag, ygt {
    public final ygu a;
    public final akmx b;
    public acvx c;
    public String d;
    public Object e;
    public aqnf f;
    private final HeartView g;
    private final yag h;

    public yem(HeartView heartView, ygu ygu, yag yag, akmx akmx) {
        amqw.a((Object) heartView);
        this.g = heartView;
        this.a = (ygu) amqw.a((Object) ygu);
        this.g.setOnClickListener(new yel(this));
        this.h = (yag) amqw.a((Object) yag);
        this.b = (akmx) amqw.a((Object) akmx);
        yeo yeo = new yeo();
    }

    public final void a(Uri uri, Uri uri2) {
        akmw a = this.b.a(uri);
        if (a != null) {
            boolean z = ((ycm) a).d;
            aqnf aqnf = this.f;
            if ((aqnf.a & 1) != 0) {
                arwf arwf = aqnf.b;
            }
            a(z, false);
        }
    }

    public final void a(boolean z, boolean z2) {
        this.g.a(z, z2);
    }

    public final void b(Object obj) {
        if (obj.getClass() == this.e.getClass()) {
            this.h.b(obj);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.b(this.d, this.e, this.f, this);
    }
}
