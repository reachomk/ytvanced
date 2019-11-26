package defpackage;

import java.io.IOException;

/* renamed from: rir */
public final class rir extends IOException {
    public rir(String str) {
        super(str);
    }

    public rir(String str, Exception exception) {
        super(str, exception);
    }

    static rir a() {
        return new rir("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static rir b() {
        return new rir("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static rir c() {
        return new rir("CodedInputStream encountered a malformed varint.");
    }
}
