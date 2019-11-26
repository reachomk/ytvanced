package defpackage;

import java.io.IOException;

/* renamed from: rfk */
public class rfk extends IOException {
    public rfk(String str) {
        super(str);
    }

    static rfk a() {
        return new rfk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static rfk b() {
        return new rfk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static rfk c() {
        return new rfk("CodedInputStream encountered a malformed varint.");
    }

    static rfk d() {
        return new rfk("Protocol message contained an invalid tag (zero).");
    }

    static rfk e() {
        return new rfk("Protocol message end-group tag did not match expected tag.");
    }

    static rfj f() {
        return new rfj("Protocol message tag had invalid wire type.");
    }

    static rfk g() {
        return new rfk("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static rfk h() {
        return new rfk("Failed to parse the message.");
    }

    static rfk i() {
        return new rfk("Protocol message had invalid UTF-8.");
    }
}
