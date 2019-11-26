package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: fwz */
abstract class fwz implements aaap {
    public final Context a;
    public final xci b;
    public final xoi c;
    public final bcaa d;
    public final fxd e;
    public final Executor f;
    private AlertDialog g;

    public fwz(Context context, xci xci, aayi aayi, xoi xoi, bcaa bcaa, fxd fxd, Executor executor) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (xci) amqw.a((Object) xci);
        amqw.a((Object) aayi);
        this.c = (xoi) amqw.a((Object) xoi);
        this.d = (bcaa) amqw.a((Object) bcaa);
        this.e = (fxd) amqw.a((Object) fxd);
        this.f = executor;
    }

    public abstract int a();

    public abstract aans a(apxu apxu, Object obj);

    /* Access modifiers changed, original: protected */
    public void a(apxu apxu) {
    }

    public abstract int b();

    public abstract int c();

    public void a(apxu apxu, Map map) {
        this.g = new Builder(this.a).setMessage(new SpannableString(this.a.getText(a()))).setNegativeButton(R.string.cancel, null).create();
        this.g.setButton(-1, this.a.getText(b()), new fxc(this, apxu, xsb.c(map, "com.google.android.libraries.youtube.innertube.endpoint.tag")));
        this.g.show();
        TextView textView = (TextView) this.g.findViewById(16908299);
        Linkify.addLinks(textView, 1);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
