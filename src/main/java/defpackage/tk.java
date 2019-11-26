package defpackage;

import android.media.AudioAttributes;

/* renamed from: tk */
public class tk implements ti {
    private AudioAttributes a;

    tk() {
    }

    public tk(AudioAttributes audioAttributes) {
        this(audioAttributes, (byte) 0);
    }

    tk(AudioAttributes audioAttributes, byte b) {
        this.a = audioAttributes;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tk)) {
            return false;
        }
        return this.a.equals(((tk) obj).a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AudioAttributesCompat: audioattributes=");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }
}
