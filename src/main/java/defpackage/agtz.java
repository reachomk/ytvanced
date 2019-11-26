package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.youtube.R;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: agtz */
public class agtz extends agrt implements xcp {
    private final Context c;
    private final HashSet d = new HashSet();

    public agtz(Context context, agvz agvz, xci xci, String str) {
        super(agvz, str);
        this.c = (Context) amqw.a((Object) context);
        amqw.a((Object) xci);
    }

    /* Access modifiers changed, original: protected */
    public void a() {
        if (f()) {
            List emptyList = Collections.emptyList();
            List c = this.a.k().c();
            agqi agqi = null;
            if (!c.isEmpty()) {
                if (c.size() > 1) {
                    agqi = agqi.a(c.size(), this.c.getString(R.string.single_videos_playlist_title));
                }
                emptyList = c;
            }
            a(agqi, emptyList);
            return;
        }
        super.a();
    }

    public final boolean e() {
        return (TextUtils.isEmpty(this.b) || f()) ? false : true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean f() {
        return TextUtils.equals("PPSV", this.b);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Iterator it;
        agvy agvy;
        if (i == -1) {
            return new Class[]{aglk.class, agll.class};
        } else if (i != 0) {
            if (i != 1) {
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (!f()) {
                return null;
            } else {
                a();
                it = this.d.iterator();
                while (it.hasNext()) {
                    agvy = (agvy) it.next();
                    b();
                    d();
                    agvy.a();
                }
                return null;
            }
        } else if (!f()) {
            return null;
        } else {
            a();
            it = this.d.iterator();
            while (it.hasNext()) {
                agvy = (agvy) it.next();
                b();
                d();
                agvy.a();
            }
            return null;
        }
    }
}
