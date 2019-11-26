package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Set;

/* renamed from: xzk */
public final class xzk {
    public final Set a = new HashSet();
    public CharSequence b;
    private final Context c;
    private final akpk d;
    private ycr e;

    public xzk(Context context, akpk akpk) {
        this.c = (Context) amqw.a((Object) context);
        this.d = (akpk) amqw.a((Object) akpk);
    }

    public final void a(Object obj) {
        this.a.add(obj);
    }

    public final void a() {
        this.d.remove(this.e);
        this.e = null;
    }

    public final void b() {
        Object ycr;
        if (this.a.size() > 0) {
            ycr = new ycr(this.c.getResources().getString(R.string.sending_with_ellipsis));
        } else if (TextUtils.isEmpty(this.b)) {
            a();
            return;
        } else {
            ycr = new ycr(this.b);
        }
        int size = this.d.size() - 1;
        while (size >= 0) {
            Object obj = this.d.get(size);
            if ((obj instanceof aqoj) || (obj instanceof ajtu) || (obj instanceof aqnr)) {
                break;
            }
            size--;
        }
        size = -1;
        if (size != -1) {
            size++;
            if (size == this.d.size() || !amqq.a(this.d.get(size), ycr)) {
                this.d.add(size, ycr);
                this.d.remove(this.e);
                this.e = ycr;
            }
            return;
        }
        a();
    }
}
