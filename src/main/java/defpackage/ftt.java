package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CaptionPickerEndpointOuterClass$CaptionPickerEndpoint;
import java.util.Map;

/* renamed from: ftt */
public final class ftt implements aaap, wxg {
    private final Context a;
    private final aizy b;
    private final hvf c;
    private final aiga d;

    public ftt(Context context, aizy aizy, hvf hvf) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (aizy) amqw.a((Object) aizy);
        this.c = (hvf) amqw.a((Object) hvf);
        this.d = new aiga(context);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(CaptionPickerEndpointOuterClass$CaptionPickerEndpoint.captionPickerEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        CaptionPickerEndpointOuterClass$CaptionPickerEndpoint captionPickerEndpointOuterClass$CaptionPickerEndpoint = (CaptionPickerEndpointOuterClass$CaptionPickerEndpoint) b;
        if ((captionPickerEndpointOuterClass$CaptionPickerEndpoint.a & 1) == 0 || !captionPickerEndpointOuterClass$CaptionPickerEndpoint.b.equals(this.c.f())) {
            xpr.a(this.a, (int) R.string.error_selecting_subtitles, 1);
        } else {
            this.b.a((wxg) this);
        }
    }
}
