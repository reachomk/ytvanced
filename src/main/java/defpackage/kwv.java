package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Space;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MetadataRowContainerRendererOuterClass;

/* renamed from: kwv */
public final class kwv extends akpl {
    private final Context a;
    private final kws b;
    private final View c;
    private final ViewGroup d = ((ViewGroup) this.c.findViewById(R.id.rich_metadata_row_container));
    private final int e;

    public kwv(Context context, kws kws) {
        this.a = context;
        this.b = kws;
        this.e = context.getResources().getDimensionPixelSize(R.dimen.rich_metadata_row_space_size);
        this.c = LayoutInflater.from(context).inflate(R.layout.rich_metadata_row, null, false);
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akpb akpb) {
        this.d.removeAllViews();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        for (axak axak : ((auxx) obj).a) {
            anxr access$000 = anxl.checkIsLite(MetadataRowContainerRendererOuterClass.richMetadataRenderer);
            axak.a(access$000);
            if (axak.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(MetadataRowContainerRendererOuterClass.richMetadataRenderer);
                axak.a(access$000);
                Object b = axak.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                auxv auxv = (auxv) b;
                kws kws = this.b;
                Object a = auxh.a(auxv.b);
                if (a == null) {
                    a = auxh.RICH_METADATA_RENDERER_STYLE_UNSPECIFIED;
                }
                kwt kwt = new kwt((Context) kws.a((Context) kws.a.get(), 1), (akkq) kws.a((akkq) kws.b.get(), 2), (akvp) kws.a((akvp) kws.c.get(), 3), (aaas) kws.a((aaas) kws.d.get(), 4), (auxh) kws.a(a, 5), (ViewGroup) kws.a(this.d, 6));
                kwt.a_(akor, auxv);
                if (this.d.getChildCount() > 0) {
                    ViewGroup viewGroup = this.d;
                    Space space = new Space(this.a);
                    int i = this.e;
                    space.setLayoutParams(new LayoutParams(i, i));
                    viewGroup.addView(space);
                }
                this.d.addView(kwt.a);
            }
        }
    }
}
