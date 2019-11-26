package defpackage;

import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: almm */
public final class almm implements akox {
    private final int a = R.layout.vertical_contact;
    private final Context b;
    private final akkq c;
    private final OnClickListener d;
    private final OnLongClickListener e;
    private final allh f;
    private final acvx g;

    public almm(Context context, akkq akkq, OnClickListener onClickListener, OnLongClickListener onLongClickListener, allh allh, acvx acvx) {
        this.b = (Context) amqw.a((Object) context);
        this.c = (akkq) amqw.a((Object) akkq);
        this.d = (OnClickListener) amqw.a((Object) onClickListener);
        this.e = (OnLongClickListener) amqw.a((Object) onLongClickListener);
        this.f = (allh) amqw.a((Object) allh);
        this.g = (acvx) amqw.a((Object) acvx);
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new almn(this.a, viewGroup, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
