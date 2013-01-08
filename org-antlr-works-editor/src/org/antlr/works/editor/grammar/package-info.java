/*
 *  Copyright (c) 2012 Sam Harwell, Tunnel Vision Laboratories LLC
 *  All rights reserved.
 * 
 *  The source code of this document is proprietary work, and is not licensed for
 *  distribution. For information about licensing, contact Sam Harwell at:
 *      sam@tunnelvisionlabs.com
 */
@NbBundle.Messages({
    "LBL_CombinedGrammarFile=ANTLR 4 Combined Grammar",
    "LBL_LexerGrammarFile=ANTLR 4 Lexer Grammar",
    "LBL_ParserGrammarFile=ANTLR 4 Parser Grammar",
})
@TemplateRegistrations({
    @TemplateRegistration(content = "resources/templates/EmptyCombinedGrammar.g4", folder = "ANTLR", displayName = "#LBL_CombinedGrammarFile", scriptEngine = "freemarker"),
    @TemplateRegistration(content = "resources/templates/EmptyLexerGrammar.g4", folder = "ANTLR", displayName = "#LBL_LexerGrammarFile", scriptEngine = "freemarker"),
    @TemplateRegistration(content = "resources/templates/EmptyParserGrammar.g4", folder = "ANTLR", displayName = "#LBL_ParserGrammarFile", scriptEngine = "freemarker"),
})
package org.antlr.works.editor.grammar;

import org.netbeans.api.templates.TemplateRegistration;
import org.netbeans.api.templates.TemplateRegistrations;
import org.openide.util.NbBundle;

