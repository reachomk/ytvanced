package defpackage;

import android.text.TextUtils;

/* renamed from: aavc */
public final class aavc extends aaml {
    public String a;
    private final String b;
    private final String c;
    private final String d;

    public aavc(aamd aamd, afpt afpt) {
        super("comment/get_comments", aamd, afpt);
        String str = "";
        this.b = str;
        this.a = str;
        this.c = str;
        this.d = str;
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        if (!TextUtils.isEmpty(this.b) && !TextUtils.isEmpty(this.d)) {
            throw new IllegalArgumentException("CommentServiceRequest: Can only set one of channelId and videoId.");
        } else if (!TextUtils.isEmpty(this.a)) {
            if (!TextUtils.isEmpty(this.b) || !TextUtils.isEmpty(this.d)) {
                throw new IllegalArgumentException("CommentServiceRequest: continuation cannot be set if videoId or channelId set.");
            }
        }
    }

    public final /* synthetic */ anzd c() {
        asfy asfy = (asfy) asfz.g.createBuilder();
        String str = this.b;
        asfy.copyOnWrite();
        asfz asfz = (asfz) asfy.instance;
        if (str != null) {
            asfz.a |= 4;
            asfz.d = str;
            str = this.a;
            asfy.copyOnWrite();
            asfz = (asfz) asfy.instance;
            if (str != null) {
                asfz.a |= 2;
                asfz.c = str;
                str = this.d;
                asfy.copyOnWrite();
                asfz = (asfz) asfy.instance;
                if (str != null) {
                    asfz.a |= 8;
                    asfz.e = str;
                    str = this.c;
                    asfy.copyOnWrite();
                    asfz = (asfz) asfy.instance;
                    if (str != null) {
                        asfz.a |= 512;
                        asfz.f = str;
                        return asfy;
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
