package defpackage;

import android.os.RemoteException;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* renamed from: muv */
final class muv extends aqj {
    public ngm p;
    public nhh q;
    public final TextView r;
    public final TextView s;
    public final ImageView t;
    public final myv u;
    public final WeakReference v;
    public final wxg w = new mux(this);
    public int x = 1;

    public muv(View view, myv myv, WeakReference weakReference) {
        super(view);
        this.u = myv;
        this.v = weakReference;
        this.r = (TextView) view.findViewById(R.id.related_title);
        this.s = (TextView) view.findViewById(R.id.related_timestamp);
        this.t = (ImageView) view.findViewById(R.id.related_thumbnail);
    }

    public final void u() {
        int i = this.x;
        if (i == 0) {
            throw null;
        } else if (i == 1) {
            ngm ngm = this.p;
            if (ngm != null) {
                myv myv = this.u;
                wxg wxg = this.w;
                Set set = (Set) myv.a.get(ngm);
                if (set != null) {
                    set.add(wxg);
                } else {
                    HashSet hashSet = new HashSet();
                    myv.a.put(ngm, hashSet);
                    hashSet.add(wxg);
                    try {
                        myv.b.a(ngm);
                    } catch (RemoteException | NullPointerException unused) {
                    }
                }
                this.x = 2;
            }
        }
    }
}
