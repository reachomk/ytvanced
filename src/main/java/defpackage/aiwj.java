package defpackage;

/* renamed from: aiwj */
final class aiwj extends aixb {
    private Boolean a;
    private Boolean b;

    aiwj() {
    }

    public final aixb a(boolean z) {
        this.a = Boolean.valueOf(z);
        return this;
    }

    public final aixb b(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    public final aiwy a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" shouldCancelPendingRequestOnNavigate");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" shouldApplyDescriptorPlaybackStateOnNavigate");
        }
        if (str.isEmpty()) {
            return new aiwg(this.a.booleanValue(), this.b.booleanValue());
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }
}
