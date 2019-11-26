package defpackage;

import com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemAsDeletedAction;
import com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemsByAuthorAsDeletedAction;

/* renamed from: abrb */
public final class abrb {
    private MarkChatItemAsDeletedAction a;
    private MarkChatItemsByAuthorAsDeletedAction b;

    public abrb(Object obj) {
        this(obj instanceof apxu ? (apxu) obj : null);
    }

    public abrb(apxu apxu) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(MarkChatItemAsDeletedAction.markChatItemAsDeletedAction);
            apxu.a(access$000);
            Object b;
            if (apxu.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(MarkChatItemAsDeletedAction.markChatItemAsDeletedAction);
                apxu.a(access$000);
                b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                this.a = (MarkChatItemAsDeletedAction) b;
            } else {
                access$000 = anxl.checkIsLite(MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction);
                apxu.a(access$000);
                if (apxu.h.a(access$000.d)) {
                    access$000 = anxl.checkIsLite(MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction);
                    apxu.a(access$000);
                    b = apxu.h.b(access$000.d);
                    if (b == null) {
                        b = access$000.b;
                    } else {
                        b = access$000.a(b);
                    }
                    this.b = (MarkChatItemsByAuthorAsDeletedAction) b;
                }
            }
        }
    }

    public final boolean a() {
        return (this.a == null && this.b == null) ? false : true;
    }

    public final arml b() {
        MarkChatItemAsDeletedAction markChatItemAsDeletedAction = this.a;
        arml arml;
        if (markChatItemAsDeletedAction == null) {
            MarkChatItemsByAuthorAsDeletedAction markChatItemsByAuthorAsDeletedAction = this.b;
            if (markChatItemsByAuthorAsDeletedAction == null) {
                return null;
            }
            arml = markChatItemsByAuthorAsDeletedAction.c;
            if (arml == null) {
                arml = arml.f;
            }
            return arml;
        }
        arml = markChatItemAsDeletedAction.c;
        if (arml == null) {
            arml = arml.f;
        }
        return arml;
    }

    public final arml c() {
        MarkChatItemAsDeletedAction markChatItemAsDeletedAction = this.a;
        arml arml;
        if (markChatItemAsDeletedAction == null) {
            MarkChatItemsByAuthorAsDeletedAction markChatItemsByAuthorAsDeletedAction = this.b;
            if (markChatItemsByAuthorAsDeletedAction == null) {
                return null;
            }
            arml = markChatItemsByAuthorAsDeletedAction.b;
            if (arml == null) {
                arml = arml.f;
            }
            return arml;
        }
        arml = markChatItemAsDeletedAction.b;
        if (arml == null) {
            arml = arml.f;
        }
        return arml;
    }
}
