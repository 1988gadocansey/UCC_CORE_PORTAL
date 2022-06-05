package ucc.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b~\b\u0087\b\u0018\u00002\u00020\u0001B\u00f1\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\b\u0010\"\u001a\u0004\u0018\u00010#\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\'\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010,\u001a\u00020-\u0012\b\u0010.\u001a\u0004\u0018\u00010/\u0012\b\u00100\u001a\u0004\u0018\u000101\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u00104\u001a\u000205\u0012\n\b\u0001\u00106\u001a\u0004\u0018\u000107\u0012\n\b\u0001\u00108\u001a\u0004\u0018\u000107\u0012\n\b\u0001\u00109\u001a\u0004\u0018\u000107\u0012\n\b\u0001\u0010:\u001a\u0004\u0018\u000107\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010<\u001a\u0004\u0018\u00010=\u0012\b\u0010>\u001a\u0004\u0018\u00010?\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010B\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D\u00a2\u0006\u0002\u0010FJ\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0011H\u00c6\u0003J\u0012\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0003\u0010\u0085\u0001J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0005H\u00c6\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0012\u0010\u0094\u0001\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u00c6\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0005H\u00c6\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010!H\u00c6\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010#H\u00c6\u0003J\u0011\u0010\u009c\u0001\u001a\u0004\u0018\u00010%H\u00c6\u0003\u00a2\u0006\u0002\u0010XJ\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00a0\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00a1\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\n\u0010\u00a2\u0001\u001a\u00020\u0005H\u00c6\u0003J\f\u0010\u00a3\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\n\u0010\u00a4\u0001\u001a\u00020-H\u00c6\u0003J\f\u0010\u00a5\u0001\u001a\u0004\u0018\u00010/H\u00c6\u0003J\f\u0010\u00a6\u0001\u001a\u0004\u0018\u000101H\u00c6\u0003J\f\u0010\u00a7\u0001\u001a\u0004\u0018\u000101H\u00c6\u0003J\f\u0010\u00a8\u0001\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\n\u0010\u00a9\u0001\u001a\u000205H\u00c6\u0003J\f\u0010\u00aa\u0001\u001a\u0004\u0018\u000107H\u00c6\u0003J\f\u0010\u00ab\u0001\u001a\u0004\u0018\u000107H\u00c6\u0003J\f\u0010\u00ac\u0001\u001a\u0004\u0018\u000107H\u00c6\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0005H\u00c6\u0003J\f\u0010\u00ae\u0001\u001a\u0004\u0018\u000107H\u00c6\u0003J\f\u0010\u00af\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00b0\u0001\u001a\u0004\u0018\u00010=H\u00c6\u0003J\f\u0010\u00b1\u0001\u001a\u0004\u0018\u00010?H\u00c6\u0003J\f\u0010\u00b2\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00b3\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u00b4\u0001\u001a\u0004\u0018\u00010%H\u00c6\u0003\u00a2\u0006\u0002\u0010XJ\f\u0010\u00b5\u0001\u001a\u0004\u0018\u00010DH\u00c6\u0003J\f\u0010\u00b6\u0001\u001a\u0004\u0018\u00010DH\u00c6\u0003J\n\u0010\u00b7\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00b8\u0001\u001a\u00020\u0005H\u00c6\u0003J\f\u0010\u00b9\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\f\u0010\u00ba\u0001\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\n\u0010\u00bb\u0001\u001a\u00020\u000fH\u00c6\u0003J\u00be\u0004\u0010\u00bc\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0003\u0010\u0016\u001a\u00020\u00052\b\b\u0003\u0010\u0017\u001a\u00020\u00052\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010,\u001a\u00020-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0003\u00103\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u00104\u001a\u0002052\n\b\u0003\u00106\u001a\u0004\u0018\u0001072\n\b\u0003\u00108\u001a\u0004\u0018\u0001072\n\b\u0003\u00109\u001a\u0004\u0018\u0001072\n\b\u0003\u0010:\u001a\u0004\u0018\u0001072\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010B\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010DH\u00c6\u0001\u00a2\u0006\u0003\u0010\u00bd\u0001J\u0015\u0010\u00be\u0001\u001a\u00020%2\t\u0010\u00bf\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00c0\u0001\u001a\u00020\u0013H\u00d6\u0001J\n\u0010\u00c1\u0001\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u00106\u001a\u0004\u0018\u000107\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0013\u0010:\u001a\u0004\u0018\u000107\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010LR\u0013\u0010;\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010JR\u0013\u0010\"\u001a\u0004\u0018\u00010#\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0018\u0010C\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0013\u00103\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0011\u0010,\u001a\u00020-\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0015\u0010$\u001a\u0004\u0018\u00010%\u00a2\u0006\n\n\u0002\u0010Y\u001a\u0004\bW\u0010XR\u0013\u0010 \u001a\u0004\u0018\u00010!\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010TR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010JR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010JR\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010JR\u0013\u0010\'\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010JR\u0013\u0010*\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010JR\u0013\u0010&\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010JR\u0013\u0010(\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010JR\u0013\u0010)\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010JR\u0013\u0010+\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010JR\u0013\u0010>\u001a\u0004\u0018\u00010?\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u0010JR\u0013\u0010@\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u0010JR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u0010JR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u0010JR\u0018\u00100\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u0013\u00102\u001a\u0004\u0018\u000101\u00a2\u0006\b\n\u0000\u001a\u0004\br\u0010qR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010tR\u0015\u0010B\u001a\u0004\u0018\u00010%\u00a2\u0006\n\n\u0002\u0010Y\u001a\u0004\bu\u0010XR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bv\u0010JR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bw\u0010JR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bx\u0010JR\u0011\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\by\u0010JR\u0013\u00109\u001a\u0004\u0018\u000107\u00a2\u0006\b\n\u0000\u001a\u0004\bz\u0010LR\u0013\u00108\u001a\u0004\u0018\u000107\u00a2\u0006\b\n\u0000\u001a\u0004\b{\u0010LR\u0011\u0010\u0016\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b|\u0010JR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b}\u0010JR\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b~\u0010JR\u0019\u0010.\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0014\u0010A\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010JR\u001a\u0010<\u001a\u0004\u0018\u00010=8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\r\n\u0003\u0010\u0086\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0013\u00104\u001a\u000205\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0019\u0010E\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010R\u00a8\u0006\u00c2\u0001"}, d2 = {"Lucc/domain/Student;", "", "id", "Ljava/util/UUID;", "firstName", "", "lastName", "middleName", "otherNames", "previousName", "title", "Lucc/domain/Title;", "gender", "Lucc/domain/Gender;", "maritalStatus", "Lucc/domain/MaritalStatus;", "dob", "Ljava/time/LocalDate;", "studentNumber", "", "indexNumber", "otherNumber", "phoneNumber", "altPhoneNumber", "email", "address", "", "Lucc/domain/Address;", "postGprs", "nhis", "ghanaCard", "homeTown", "district", "Lucc/domain/District;", "country", "Lucc/domain/Countries;", "disabled", "", "guildianName", "guildianAddress", "guildianOccupation", "guildianPhone", "guildianEmail", "guildianRelationship", "disabilities", "Lucc/domain/Disabilities;", "programme", "Lucc/domain/Programme;", "level", "Lucc/domain/Level;", "levelAdmitted", "dateAdmitted", "studentType", "Lucc/domain/StudentType;", "bills", "Ljava/math/BigDecimal;", "paid", "outstanding", "cgpa", "classObtained", "studentConstraints", "Lucc/domain/StudentConstraints;", "halls", "Lucc/domain/Halls;", "hostel", "roomNumber", "matriculated", "createdAt", "Ljava/time/LocalDateTime;", "updatedAt", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lucc/domain/Title;Lucc/domain/Gender;Lucc/domain/MaritalStatus;Ljava/time/LocalDate;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lucc/domain/District;Lucc/domain/Countries;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lucc/domain/Disabilities;Lucc/domain/Programme;Lucc/domain/Level;Lucc/domain/Level;Ljava/time/LocalDate;Lucc/domain/StudentType;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Lucc/domain/StudentConstraints;Lucc/domain/Halls;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)V", "getAddress", "()Ljava/util/List;", "getAltPhoneNumber", "()Ljava/lang/String;", "getBills", "()Ljava/math/BigDecimal;", "getCgpa", "getClassObtained", "getCountry", "()Lucc/domain/Countries;", "getCreatedAt", "()Ljava/time/LocalDateTime;", "getDateAdmitted", "()Ljava/time/LocalDate;", "getDisabilities", "()Lucc/domain/Disabilities;", "getDisabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDistrict", "()Lucc/domain/District;", "getDob", "getEmail", "getFirstName", "getGender", "()Lucc/domain/Gender;", "getGhanaCard", "getGuildianAddress", "getGuildianEmail", "getGuildianName", "getGuildianOccupation", "getGuildianPhone", "getGuildianRelationship", "getHalls", "()Lucc/domain/Halls;", "getHomeTown", "getHostel", "getId", "()Ljava/util/UUID;", "getIndexNumber", "getLastName", "getLevel", "()Lucc/domain/Level;", "getLevelAdmitted", "getMaritalStatus", "()Lucc/domain/MaritalStatus;", "getMatriculated", "getMiddleName", "getNhis", "getOtherNames", "getOtherNumber", "getOutstanding", "getPaid", "getPhoneNumber", "getPostGprs", "getPreviousName", "getProgramme", "()Lucc/domain/Programme;", "getRoomNumber", "getStudentConstraints", "()Lucc/domain/StudentConstraints;", "getStudentNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStudentType", "()Lucc/domain/StudentType;", "getTitle", "()Lucc/domain/Title;", "getUpdatedAt", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lucc/domain/Title;Lucc/domain/Gender;Lucc/domain/MaritalStatus;Ljava/time/LocalDate;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lucc/domain/District;Lucc/domain/Countries;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lucc/domain/Disabilities;Lucc/domain/Programme;Lucc/domain/Level;Lucc/domain/Level;Ljava/time/LocalDate;Lucc/domain/StudentType;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Lucc/domain/StudentConstraints;Lucc/domain/Halls;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)Lucc/domain/Student;", "equals", "other", "hashCode", "toString", "ucc"})
@io.micronaut.data.annotation.MappedEntity
@io.micronaut.core.annotation.Introspected
public final class Student {
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.Id
    @io.micronaut.data.annotation.AutoPopulated
    private final java.util.UUID id = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String firstName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String lastName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String middleName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String otherNames = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String previousName = null;
    @org.jetbrains.annotations.Nullable
    private final ucc.domain.Title title = null;
    @org.jetbrains.annotations.Nullable
    private final ucc.domain.Gender gender = null;
    @org.jetbrains.annotations.NotNull
    private final ucc.domain.MaritalStatus maritalStatus = null;
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDate dob = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer studentNumber = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String indexNumber = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String otherNumber = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String phoneNumber = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String altPhoneNumber = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String email = null;
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.Relation(value = io.micronaut.data.annotation.Relation.Kind.MANY_TO_MANY)
    private final java.util.List<ucc.domain.Address> address = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String postGprs = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String nhis = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String ghanaCard = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String homeTown = null;
    @org.jetbrains.annotations.Nullable
    private final ucc.domain.District district = null;
    @org.jetbrains.annotations.Nullable
    private final ucc.domain.Countries country = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean disabled = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String guildianName = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String guildianAddress = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String guildianOccupation = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String guildianPhone = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String guildianEmail = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String guildianRelationship = null;
    @org.jetbrains.annotations.NotNull
    private final ucc.domain.Disabilities disabilities = null;
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.Relation(value = io.micronaut.data.annotation.Relation.Kind.MANY_TO_ONE)
    private final ucc.domain.Programme programme = null;
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.Relation(value = io.micronaut.data.annotation.Relation.Kind.MANY_TO_ONE)
    private final ucc.domain.Level level = null;
    @org.jetbrains.annotations.Nullable
    private final ucc.domain.Level levelAdmitted = null;
    @org.jetbrains.annotations.Nullable
    private final java.time.LocalDate dateAdmitted = null;
    @org.jetbrains.annotations.NotNull
    private final ucc.domain.StudentType studentType = null;
    @org.jetbrains.annotations.Nullable
    private final java.math.BigDecimal bills = null;
    @org.jetbrains.annotations.Nullable
    private final java.math.BigDecimal paid = null;
    @org.jetbrains.annotations.Nullable
    private final java.math.BigDecimal outstanding = null;
    @org.jetbrains.annotations.Nullable
    private final java.math.BigDecimal cgpa = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String classObtained = null;
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.Relation(value = io.micronaut.data.annotation.Relation.Kind.ONE_TO_ONE)
    private final ucc.domain.StudentConstraints studentConstraints = null;
    @org.jetbrains.annotations.Nullable
    private final ucc.domain.Halls halls = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String hostel = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String roomNumber = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean matriculated = null;
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.DateCreated
    private final java.time.LocalDateTime createdAt = null;
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.DateUpdated
    private final java.time.LocalDateTime updatedAt = null;
    
    @org.jetbrains.annotations.NotNull
    public final ucc.domain.Student copy(@org.jetbrains.annotations.Nullable
    java.util.UUID id, @org.jetbrains.annotations.NotNull
    java.lang.String firstName, @org.jetbrains.annotations.NotNull
    java.lang.String lastName, @org.jetbrains.annotations.NotNull
    java.lang.String middleName, @org.jetbrains.annotations.NotNull
    java.lang.String otherNames, @org.jetbrains.annotations.NotNull
    java.lang.String previousName, @org.jetbrains.annotations.Nullable
    ucc.domain.Title title, @org.jetbrains.annotations.Nullable
    ucc.domain.Gender gender, @org.jetbrains.annotations.NotNull
    ucc.domain.MaritalStatus maritalStatus, @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.Past
    java.time.LocalDate dob, @org.jetbrains.annotations.Nullable
    java.lang.Integer studentNumber, @org.jetbrains.annotations.Nullable
    java.lang.String indexNumber, @org.jetbrains.annotations.NotNull
    java.lang.String otherNumber, @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.Pattern(regexp = "\\(\\d{3}\\)\\d{3}-\\d{4}")
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.Pattern(regexp = "\\(\\d{3}\\)\\d{3}-\\d{4}")
    java.lang.String altPhoneNumber, @org.jetbrains.annotations.Nullable
    @javax.validation.constraints.Email
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.util.List<ucc.domain.Address> address, @org.jetbrains.annotations.Nullable
    java.lang.String postGprs, @org.jetbrains.annotations.Nullable
    java.lang.String nhis, @org.jetbrains.annotations.Nullable
    java.lang.String ghanaCard, @org.jetbrains.annotations.Nullable
    java.lang.String homeTown, @org.jetbrains.annotations.Nullable
    ucc.domain.District district, @org.jetbrains.annotations.Nullable
    ucc.domain.Countries country, @org.jetbrains.annotations.Nullable
    java.lang.Boolean disabled, @org.jetbrains.annotations.Nullable
    java.lang.String guildianName, @org.jetbrains.annotations.Nullable
    java.lang.String guildianAddress, @org.jetbrains.annotations.Nullable
    java.lang.String guildianOccupation, @org.jetbrains.annotations.Nullable
    java.lang.String guildianPhone, @org.jetbrains.annotations.Nullable
    @javax.validation.constraints.Email
    java.lang.String guildianEmail, @org.jetbrains.annotations.Nullable
    java.lang.String guildianRelationship, @org.jetbrains.annotations.NotNull
    ucc.domain.Disabilities disabilities, @org.jetbrains.annotations.Nullable
    ucc.domain.Programme programme, @org.jetbrains.annotations.Nullable
    ucc.domain.Level level, @org.jetbrains.annotations.Nullable
    ucc.domain.Level levelAdmitted, @org.jetbrains.annotations.Nullable
    @javax.validation.constraints.Past
    java.time.LocalDate dateAdmitted, @org.jetbrains.annotations.NotNull
    ucc.domain.StudentType studentType, @org.jetbrains.annotations.Nullable
    @javax.validation.constraints.Digits(integer = 6, fraction = 2)
    java.math.BigDecimal bills, @org.jetbrains.annotations.Nullable
    @javax.validation.constraints.Digits(integer = 6, fraction = 2)
    java.math.BigDecimal paid, @org.jetbrains.annotations.Nullable
    @javax.validation.constraints.Digits(integer = 6, fraction = 2)
    java.math.BigDecimal outstanding, @org.jetbrains.annotations.Nullable
    @javax.validation.constraints.Digits(integer = 6, fraction = 2)
    java.math.BigDecimal cgpa, @org.jetbrains.annotations.Nullable
    java.lang.String classObtained, @org.jetbrains.annotations.Nullable
    ucc.domain.StudentConstraints studentConstraints, @org.jetbrains.annotations.Nullable
    ucc.domain.Halls halls, @org.jetbrains.annotations.Nullable
    java.lang.String hostel, @org.jetbrains.annotations.Nullable
    java.lang.String roomNumber, @org.jetbrains.annotations.Nullable
    java.lang.Boolean matriculated, @org.jetbrains.annotations.Nullable
    java.time.LocalDateTime createdAt, @org.jetbrains.annotations.Nullable
    java.time.LocalDateTime updatedAt) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public Student(@org.jetbrains.annotations.Nullable
    java.util.UUID id, @org.jetbrains.annotations.NotNull
    java.lang.String firstName, @org.jetbrains.annotations.NotNull
    java.lang.String lastName, @org.jetbrains.annotations.NotNull
    java.lang.String middleName, @org.jetbrains.annotations.NotNull
    java.lang.String otherNames, @org.jetbrains.annotations.NotNull
    java.lang.String previousName, @org.jetbrains.annotations.Nullable
    ucc.domain.Title title, @org.jetbrains.annotations.Nullable
    ucc.domain.Gender gender, @org.jetbrains.annotations.NotNull
    ucc.domain.MaritalStatus maritalStatus, @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.Past
    java.time.LocalDate dob, @org.jetbrains.annotations.Nullable
    java.lang.Integer studentNumber, @org.jetbrains.annotations.Nullable
    java.lang.String indexNumber, @org.jetbrains.annotations.NotNull
    java.lang.String otherNumber, @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.Pattern(regexp = "\\(\\d{3}\\)\\d{3}-\\d{4}")
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.Pattern(regexp = "\\(\\d{3}\\)\\d{3}-\\d{4}")
    java.lang.String altPhoneNumber, @org.jetbrains.annotations.Nullable
    @javax.validation.constraints.Email
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.util.List<ucc.domain.Address> address, @org.jetbrains.annotations.Nullable
    java.lang.String postGprs, @org.jetbrains.annotations.Nullable
    java.lang.String nhis, @org.jetbrains.annotations.Nullable
    java.lang.String ghanaCard, @org.jetbrains.annotations.Nullable
    java.lang.String homeTown, @org.jetbrains.annotations.Nullable
    ucc.domain.District district, @org.jetbrains.annotations.Nullable
    ucc.domain.Countries country, @org.jetbrains.annotations.Nullable
    java.lang.Boolean disabled, @org.jetbrains.annotations.Nullable
    java.lang.String guildianName, @org.jetbrains.annotations.Nullable
    java.lang.String guildianAddress, @org.jetbrains.annotations.Nullable
    java.lang.String guildianOccupation, @org.jetbrains.annotations.Nullable
    java.lang.String guildianPhone, @org.jetbrains.annotations.Nullable
    @javax.validation.constraints.Email
    java.lang.String guildianEmail, @org.jetbrains.annotations.Nullable
    java.lang.String guildianRelationship, @org.jetbrains.annotations.NotNull
    ucc.domain.Disabilities disabilities, @org.jetbrains.annotations.Nullable
    ucc.domain.Programme programme, @org.jetbrains.annotations.Nullable
    ucc.domain.Level level, @org.jetbrains.annotations.Nullable
    ucc.domain.Level levelAdmitted, @org.jetbrains.annotations.Nullable
    @javax.validation.constraints.Past
    java.time.LocalDate dateAdmitted, @org.jetbrains.annotations.NotNull
    ucc.domain.StudentType studentType, @org.jetbrains.annotations.Nullable
    @javax.validation.constraints.Digits(integer = 6, fraction = 2)
    java.math.BigDecimal bills, @org.jetbrains.annotations.Nullable
    @javax.validation.constraints.Digits(integer = 6, fraction = 2)
    java.math.BigDecimal paid, @org.jetbrains.annotations.Nullable
    @javax.validation.constraints.Digits(integer = 6, fraction = 2)
    java.math.BigDecimal outstanding, @org.jetbrains.annotations.Nullable
    @javax.validation.constraints.Digits(integer = 6, fraction = 2)
    java.math.BigDecimal cgpa, @org.jetbrains.annotations.Nullable
    java.lang.String classObtained, @org.jetbrains.annotations.Nullable
    ucc.domain.StudentConstraints studentConstraints, @org.jetbrains.annotations.Nullable
    ucc.domain.Halls halls, @org.jetbrains.annotations.Nullable
    java.lang.String hostel, @org.jetbrains.annotations.Nullable
    java.lang.String roomNumber, @org.jetbrains.annotations.Nullable
    java.lang.Boolean matriculated, @org.jetbrains.annotations.Nullable
    java.time.LocalDateTime createdAt, @org.jetbrains.annotations.Nullable
    java.time.LocalDateTime updatedAt) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.UUID component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.UUID getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFirstName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLastName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMiddleName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOtherNames() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPreviousName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Title component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Title getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Gender component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Gender getGender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ucc.domain.MaritalStatus component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ucc.domain.MaritalStatus getMaritalStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDate component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDate getDob() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getStudentNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getIndexNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOtherNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPhoneNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAltPhoneNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<ucc.domain.Address> component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<ucc.domain.Address> getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPostGprs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNhis() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getGhanaCard() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHomeTown() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.District component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.District getDistrict() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Countries component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Countries getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getDisabled() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getGuildianName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getGuildianAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getGuildianOccupation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getGuildianPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getGuildianEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getGuildianRelationship() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ucc.domain.Disabilities component31() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ucc.domain.Disabilities getDisabilities() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Programme component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Programme getProgramme() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Level component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Level getLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Level component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Level getLevelAdmitted() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDate component35() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDate getDateAdmitted() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ucc.domain.StudentType component36() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ucc.domain.StudentType getStudentType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.math.BigDecimal component37() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.math.BigDecimal getBills() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.math.BigDecimal component38() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.math.BigDecimal getPaid() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.math.BigDecimal component39() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.math.BigDecimal getOutstanding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.math.BigDecimal component40() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.math.BigDecimal getCgpa() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component41() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getClassObtained() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.StudentConstraints component42() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.StudentConstraints getStudentConstraints() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Halls component43() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Halls getHalls() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component44() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHostel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component45() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRoomNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component46() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getMatriculated() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDateTime component47() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDateTime getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDateTime component48() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDateTime getUpdatedAt() {
        return null;
    }
}