package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.youtube.R;

/* renamed from: abvh */
public class abvh extends abtz {
    private final akle i;
    private final akkl j;
    private final LinearLayout k = ((LinearLayout) this.b.findViewById(R.id.thumbnail_holder));

    public abvh(Context context, acwa acwa, aaas aaas, akkl akkl) {
        super(context, acwa, aaas);
        this.i = aklf.a((xnk) akkl, this.c);
        this.j = akkl;
    }

    public final void a(aygk aygk) {
        this.i.a(aygk);
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        this.i.b();
        this.k.removeAllViews();
        this.k.setVisibility(8);
        this.d.setVisibility(0);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        augv augv = (augv) obj;
        super.a_(akor, augv);
        if (augv.j.size() != 0) {
            for (aygk aygk : augv.j) {
                ImageView imageView = new ImageView(this.a);
                aodx aodx = aygk.d;
                if (aodx == null) {
                    aodx = aodx.c;
                }
                if ((aodx.a & 1) != 0) {
                    aodv aodv = aodx.b;
                    if (aodv == null) {
                        aodv = aodv.c;
                    }
                    imageView.setContentDescription(aodv.b);
                }
                int dimension = (int) this.a.getResources().getDimension(R.dimen.live_chat_ticker_thumbnail_size);
                this.k.setVisibility(0);
                this.k.addView(imageView, dimension, dimension);
                aklf.a(this.j, imageView).a(aygk);
            }
            this.d.setVisibility(8);
        }
    }
}
