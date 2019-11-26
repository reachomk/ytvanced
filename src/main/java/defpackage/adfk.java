package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: adfk */
final class adfk implements OnItemClickListener {
    private final /* synthetic */ adfl a;

    adfk(adfl adfl) {
        this.a = adfl;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (this.a.e.a(new adfn(this, adapterView, view, i, j))) {
            this.a.dismiss();
        } else {
            a(adapterView, view, i, j);
        }
    }

    public final void a(AdapterView adapterView, View view, int i, long j) {
        bbs bbs = (bbs) adapterView.getItemAtPosition(i);
        if (!adgy.a(this.a.c, bbs) || ((Boolean) this.a.d.get()).booleanValue()) {
            OnItemClickListener onItemClickListener = this.a.a;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i, j);
                return;
            }
            return;
        }
        this.a.b.d(new adew(bbs));
        this.a.dismiss();
    }
}
