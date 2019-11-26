package defpackage;

import com.google.android.gms.cast.MediaTrack;

/* renamed from: pkb */
public final class pkb {
    public final MediaTrack a;

    public pkb(long j, int i) {
        this.a = new MediaTrack(j, i);
    }

    public final pkb a(String str) {
        this.a.c = str;
        return this;
    }

    public final pkb b(String str) {
        this.a.e = str;
        return this;
    }

    public final pkb a(int i) {
        MediaTrack mediaTrack = this.a;
        if (i < 0 || i > 5) {
            StringBuilder stringBuilder = new StringBuilder(27);
            stringBuilder.append("invalid subtype ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i == 0 || mediaTrack.b == 1) {
            mediaTrack.g = i;
            return this;
        } else {
            throw new IllegalArgumentException("subtypes are only valid for text tracks");
        }
    }
}
