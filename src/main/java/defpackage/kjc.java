package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.protos.youtube.api.innertube.ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer;

/* renamed from: kjc */
final /* synthetic */ class kjc implements OnClickListener {
    private final kjd a;
    private final ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer b;

    kjc(kjd kjd, ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer) {
        this.a = kjd;
        this.b = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer;
    }

    public final void onClick(View view) {
        kjd kjd = this.a;
        ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer = this.b;
        aaas aaas = kjd.a;
        apxu apxu = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.b;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
    }
}
