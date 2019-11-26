package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.protos.youtube.api.innertube.InviteMoreEndpointOuterClass$InviteMoreEndpoint;

/* renamed from: ypt */
final /* synthetic */ class ypt implements OnClickListener {
    private final String a;
    private final aaas b;

    ypt(String str, aaas aaas) {
        this.a = str;
        this.b = aaas;
    }

    public final void onClick(View view) {
        String str = this.a;
        aaas aaas = this.b;
        atuy atuy = (atuy) InviteMoreEndpointOuterClass$InviteMoreEndpoint.d.createBuilder();
        atuy.a(str);
        InviteMoreEndpointOuterClass$InviteMoreEndpoint inviteMoreEndpointOuterClass$InviteMoreEndpoint = (InviteMoreEndpointOuterClass$InviteMoreEndpoint) ((anxl) atuy.build());
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(InviteMoreEndpointOuterClass$InviteMoreEndpoint.inviteMoreEndpoint, inviteMoreEndpointOuterClass$InviteMoreEndpoint);
        aaas.a((apxu) ((anxl) apxx.build()), null);
    }
}
