package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: yey */
public final class yey extends yde {
    public final ImageView a = ((ImageView) this.i.findViewById(R.id.playlist_thumbnail));
    public final aaas g;
    private final TextView m = ((TextView) this.i.findViewById(R.id.playlist_title));
    private final TextView n = ((TextView) this.i.findViewById(R.id.playlist_metadata_count));
    private final TextView o = ((TextView) this.i.findViewById(R.id.playlist_metadata_separator));
    private final TextView p = ((TextView) this.i.findViewById(R.id.playlist_metadata_author));
    private final akkq q;
    private final LinearLayout r = ((LinearLayout) this.i.findViewById(R.id.chat_bubble_content));

    public yey(View view, aaas aaas, akkq akkq, ygu ygu, akmx akmx) {
        super(view, aaas, akkq, ygu, akmx);
        a((int) R.layout.conversation_playlist_bubble);
        this.g = aaas;
        this.r.setOnLongClickListener(new yex(this));
        this.q = akkq;
    }

    /* Access modifiers changed, original: protected|final */
    public final TextView f() {
        return this.m;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aqnx aqnx = (aqnx) obj;
        super.a_(akor, aqnx);
        this.r.setOnClickListener(new yfa(this, aqnx));
        this.m.setText(aqnx.j);
        TextView textView;
        arml arml;
        if ((aqnx.a & 4194304) == 0) {
            this.p.setText(aqnx.k);
            this.o.setVisibility(8);
            this.n.setVisibility(8);
        } else if (aqnx.k.isEmpty()) {
            this.o.setVisibility(8);
            this.p.setVisibility(8);
            textView = this.n;
            if ((4194304 & aqnx.a) != 0) {
                arml = aqnx.t;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml));
        } else {
            this.p.setText(aqnx.k);
            textView = this.n;
            arml = aqnx.t;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
        }
        int dimensionPixelSize = this.f.getResources().getDimensionPixelSize(R.dimen.conversation_playlist_image_square_size);
        if ((aqnx.a & 2097152) != 0) {
            akkq akkq = this.q;
            aygk aygk = aqnx.s;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akkq.b(aklb.b(aygk, dimensionPixelSize), new yez(this));
        }
    }
}
