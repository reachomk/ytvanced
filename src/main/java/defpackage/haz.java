package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: haz */
public final class haz implements aaap {
    public final hau a;
    public abuw b;
    private final Context c;
    private final abez d;
    private final Executor e;

    public haz(Context context, abez abez, hau hau, Executor executor) {
        this.c = context;
        this.d = abez;
        this.a = hau;
        this.e = executor;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.openSuperStickerBuyFlowCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand openSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand = (OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand) b;
        abez abez = this.d;
        abfb abfb = new abfb(abez.c, abez.d.c());
        abfb.a = openSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.b;
        this.b = (abuw) xsb.a(map, (Object) "live_chat_product_picker_endpoint_key", abuw.class);
        abuw abuw = this.b;
        if (abuw != null) {
            abuw.a(true);
        }
        xan.a(this.d.a.a(abfb), this.e, new hay(this), new hbb(this), ankh.a);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void a() {
        abuw abuw = this.b;
        if (abuw != null) {
            abuw.a(false);
        }
        Toast.makeText(this.c, R.string.error_generic, 0).show();
    }
}
