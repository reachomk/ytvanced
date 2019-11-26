package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: ykp */
public final class ykp extends yie {
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final ykn f;

    public final String getConversationId() {
        return this.b;
    }

    public final String getChatMessageSetKey() {
        return this.c;
    }

    public final String getAuthorKey() {
        return this.d;
    }

    public final String getText() {
        return this.e;
    }

    public final ykn getAttachment() {
        return this.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ykp) {
            ykp ykp = (ykp) obj;
            if (TextUtils.equals(this.b, ykp.b) && TextUtils.equals(this.c, ykp.c) && TextUtils.equals(this.d, ykp.d) && TextUtils.equals(this.e, ykp.e) && amqq.a(this.f, ykp.f)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("key", this.a);
        a.a("conversationId", this.b);
        a.a("authorKey", this.d);
        a.a("chatMessageSetKey", this.c);
        a.a("text", this.e);
        a.a("attachment", this.f);
        return a.toString();
    }

    public final yks f() {
        return new yks(this);
    }

    /* synthetic */ ykp(String str, String str2, String str3, String str4, String str5, ykn ykn) {
        super(str, null);
        this.b = xvd.a(str2);
        this.d = xvd.a(str4);
        this.c = xvd.a(str3);
        this.e = str5;
        this.f = ykn;
    }
}
