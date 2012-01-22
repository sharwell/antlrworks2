/*
 * [The "BSD license"]
 *  Copyright (c) 2012 Sam Harwell
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions
 *  are met:
 *  1. Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *  2. Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *  3. The name of the author may not be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 *  IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 *  IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 *  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 *  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 *  THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 *  THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.antlr.works.editor.grammar.parser;

import java.util.List;
import org.antlr.grammar.v3.ANTLRParser;
import org.antlr.runtime.CommonToken;
import org.antlr.works.editor.shared.parser.SyntaxError;
import org.netbeans.api.annotations.common.CheckForNull;
import org.netbeans.api.annotations.common.NonNull;
import org.netbeans.api.annotations.common.NullAllowed;
import org.openide.filesystems.FileObject;
import org.openide.util.Parameters;

/**
 *
 * @author Sam Harwell
 */
public class CompiledFileModelV3 extends CompiledFileModel {

    @NonNull
    private final ANTLRErrorProvidingParser parser;
    @NullAllowed
    private final GrammarWrapper grammar;
    @NullAllowed
    private final ANTLRParser.grammar__return result;

    public CompiledFileModelV3(@NonNull ANTLRErrorProvidingParser parser, @NullAllowed GrammarWrapper grammar, @NullAllowed ANTLRParser.grammar__return result, @NonNull FileObject fileObject, @NullAllowed CommonToken[] tokens) {
        super(fileObject, tokens);
        Parameters.notNull("parser", parser);

        this.parser = parser;
        this.grammar = grammar;
        this.result = result;
    }

    @CheckForNull
    public GrammarWrapper getGrammar() {
        return grammar;
    }

    @CheckForNull
    public ANTLRParser.grammar__return getResult() {
        return result;
    }

    @NonNull
    public ANTLRErrorProvidingParser getParser() {
        return parser;
    }

    @Override
    public List<? extends SyntaxError> getSyntaxErrors() {
        return getParser().getSyntaxErrors();
    }

}