package defpackage;

/* renamed from: aatp */
public final class aatp extends aamz {
    public aatp(aamd aamd, afpt afpt, String str, String str2) {
        asqy asqy = (asqy) asqv.e.createBuilder();
        asqy.copyOnWrite();
        asqv asqv = (asqv) asqy.instance;
        if (str != null) {
            asqv.a |= 4;
            asqv.d = str;
            asqy.copyOnWrite();
            asqv asqv2 = (asqv) asqy.instance;
            if (str2 != null) {
                asqv2.a |= 2;
                asqv2.c = str2;
                super(aamd, afpt, "conversation/get_conversation_attachment", asqy);
                return;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        xvd.a(((asqv) ((asqy) c()).instance).d);
        xvd.a(((asqv) ((asqy) c()).instance).c);
    }
}
