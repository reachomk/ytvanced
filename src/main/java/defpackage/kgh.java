package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: kgh */
public final class kgh implements akot {
    public apxu a;
    private final akkq b;
    private final ImageView c;
    private final akko d = akko.h().a((int) R.drawable.missing_avatar).a();

    public kgh(Activity activity, akkq akkq, aaas aaas, ViewGroup viewGroup) {
        this.b = (akkq) amqw.a((Object) akkq);
        amqw.a((Object) activity);
        amqw.a((Object) aaas);
        amqw.a((Object) viewGroup);
        this.c = (ImageView) LayoutInflater.from(activity).inflate(R.layout.playlist_collaborator, viewGroup, false);
        this.c.setOnClickListener(new kgg(this, aaas));
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akpb akpb) {
        this.b.a(this.c);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aygk aygk;
        awjt awjt = (awjt) obj;
        akkq akkq = this.b;
        ImageView imageView = this.c;
        apxu apxu = null;
        if ((awjt.a & 2) != 0) {
            aygk = awjt.c;
            if (aygk == null) {
                aygk = aygk.f;
            }
        } else {
            aygk = null;
        }
        akkq.a(imageView, aygk, this.d);
        if ((awjt.a & 8) != 0) {
            apxu = awjt.d;
            if (apxu == null) {
                apxu = apxu.d;
            }
        }
        this.a = apxu;
    }
}
