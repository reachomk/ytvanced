package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import com.google.android.youtube.R;

/* renamed from: jwh */
public final class jwh extends akyg implements OnItemClickListener, hws {
    private aahn[] Z;
    private int aa;
    private aiay ab;

    /* Access modifiers changed, original: protected|final */
    public final int W() {
        return 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final OnItemClickListener Y() {
        return this;
    }

    public final void a(aiay aiay) {
        this.ab = aiay;
    }

    public final void a(aahn[] aahnArr, int i) {
        if (this.Z != aahnArr || this.aa != i) {
            this.Z = aahnArr;
            this.aa = i;
            ListAdapter listAdapter = this.aq;
            if (listAdapter != null) {
                ((akyj) listAdapter).notifyDataSetChanged();
            }
        }
    }

    public final void a(nn nnVar) {
        if (!F_() && !v()) {
            a(nnVar.f(), "AUDIO_TRACKS_MENU_BOTTOM_SHEET_FRAGMENT");
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final String X() {
        return q().getString(R.string.audio_tracks_title);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.ab.a(((jwi) ((akyj) this.aq).getItem(i)).a.a);
        dismiss();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ ListAdapter Z() {
        akyj akyj = new akyj(p(), X() == null);
        if (this.Z != null) {
            int i = 0;
            while (i < this.Z.length) {
                jwi jwi = new jwi(p(), this.Z[i]);
                jwi.a(i == this.aa);
                akyj.add(jwi);
                i++;
            }
        }
        return akyj;
    }
}
