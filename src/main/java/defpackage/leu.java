package defpackage;

import com.google.protos.youtube.api.innertube.ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint;
import com.google.protos.youtube.api.innertube.ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand;
import java.util.HashMap;
import java.util.Map;

/* renamed from: leu */
public final class leu {
    public len a;
    public bcaa b;
    public bcaa c;
    public final Map d = new HashMap();
    public boolean e;

    /* Access modifiers changed, original: final */
    public final lev a(apxu apxu) {
        if (apxu == null || !this.e || this.a == null) {
            return null;
        }
        anxr access$000 = anxl.checkIsLite(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint);
        apxu.a(access$000);
        anxr access$0002;
        Object b;
        if (apxu.h.a(access$000.d)) {
            access$0002 = anxl.checkIsLite(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint);
            apxu.a(access$0002);
            b = apxu.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            return b(((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) b).b);
        }
        access$000 = anxl.checkIsLite(ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.showEngagementPanelNavigationEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$0002 = anxl.checkIsLite(ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.showEngagementPanelNavigationEndpoint);
            apxu.a(access$0002);
            b = apxu.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            return b(((ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint) b).b);
        }
        access$000 = anxl.checkIsLite(ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.showCommentRepliesEngagementPanelCommand);
        apxu.a(access$000);
        String str;
        if (apxu.h.a(access$000.d)) {
            access$0002 = anxl.checkIsLite(ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.showCommentRepliesEngagementPanelCommand);
            apxu.a(access$0002);
            b = apxu.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            str = ((ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) b).b;
            ldt ldt = (ldt) this.b.get();
            ldt.h = new lex(this, str);
            ldt.a(new lew(str));
            return new lfb(this, str, ldt);
        }
        access$000 = anxl.checkIsLite(ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.showSponsorshipsEngagementPanelCommand);
        apxu.a(access$000);
        if (!apxu.h.a(access$000.d)) {
            return null;
        }
        access$0002 = anxl.checkIsLite(ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.showSponsorshipsEngagementPanelCommand);
        apxu.a(access$0002);
        b = apxu.h.b(access$0002.d);
        if (b == null) {
            b = access$0002.b;
        } else {
            b = access$0002.a(b);
        }
        str = ((ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand) b).b;
        lfo lfo = (lfo) this.c.get();
        lfo.l = new lez(this, str);
        return new lfb(this, str, lfo);
    }

    public final boolean a(String str) {
        return b(str) != null;
    }

    public final lev b(String str) {
        return (lev) this.d.get(str);
    }
}
