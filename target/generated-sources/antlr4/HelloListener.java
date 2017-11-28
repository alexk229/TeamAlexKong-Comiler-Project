// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(@NotNull HelloParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(@NotNull HelloParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(@NotNull HelloParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(@NotNull HelloParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(@NotNull HelloParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(@NotNull HelloParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull HelloParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull HelloParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#whenEntry}.
	 * @param ctx the parse tree
	 */
	void enterWhenEntry(@NotNull HelloParser.WhenEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#whenEntry}.
	 * @param ctx the parse tree
	 */
	void exitWhenEntry(@NotNull HelloParser.WhenEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterVariableType(@NotNull HelloParser.VariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitVariableType(@NotNull HelloParser.VariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(@NotNull HelloParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(@NotNull HelloParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#methodDeclarationRest}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarationRest(@NotNull HelloParser.MethodDeclarationRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#methodDeclarationRest}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarationRest(@NotNull HelloParser.MethodDeclarationRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(@NotNull HelloParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(@NotNull HelloParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull HelloParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull HelloParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(@NotNull HelloParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(@NotNull HelloParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#variableModifiers}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifiers(@NotNull HelloParser.VariableModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#variableModifiers}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifiers(@NotNull HelloParser.VariableModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(@NotNull HelloParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(@NotNull HelloParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(@NotNull HelloParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(@NotNull HelloParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(@NotNull HelloParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(@NotNull HelloParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(@NotNull HelloParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(@NotNull HelloParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#constantDeclaratorsRest}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaratorsRest(@NotNull HelloParser.ConstantDeclaratorsRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#constantDeclaratorsRest}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaratorsRest(@NotNull HelloParser.ConstantDeclaratorsRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull HelloParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull HelloParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(@NotNull HelloParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(@NotNull HelloParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#constantDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaratorRest(@NotNull HelloParser.ConstantDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#constantDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaratorRest(@NotNull HelloParser.ConstantDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull HelloParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull HelloParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull HelloParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull HelloParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(@NotNull HelloParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(@NotNull HelloParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(@NotNull HelloParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(@NotNull HelloParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(@NotNull HelloParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(@NotNull HelloParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull HelloParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull HelloParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(@NotNull HelloParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(@NotNull HelloParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(@NotNull HelloParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(@NotNull HelloParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull HelloParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull HelloParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull HelloParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull HelloParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(@NotNull HelloParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(@NotNull HelloParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#voidMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterVoidMethodDeclaratorRest(@NotNull HelloParser.VoidMethodDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#voidMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitVoidMethodDeclaratorRest(@NotNull HelloParser.VoidMethodDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(@NotNull HelloParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(@NotNull HelloParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(@NotNull HelloParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(@NotNull HelloParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(@NotNull HelloParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(@NotNull HelloParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(@NotNull HelloParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(@NotNull HelloParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(@NotNull HelloParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(@NotNull HelloParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#formalParameterDeclsRest}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterDeclsRest(@NotNull HelloParser.FormalParameterDeclsRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#formalParameterDeclsRest}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterDeclsRest(@NotNull HelloParser.FormalParameterDeclsRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(@NotNull HelloParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(@NotNull HelloParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(@NotNull HelloParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(@NotNull HelloParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull HelloParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull HelloParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull HelloParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull HelloParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(@NotNull HelloParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(@NotNull HelloParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(@NotNull HelloParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(@NotNull HelloParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(@NotNull HelloParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(@NotNull HelloParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(@NotNull HelloParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(@NotNull HelloParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(@NotNull HelloParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(@NotNull HelloParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull HelloParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull HelloParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull HelloParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull HelloParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull HelloParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull HelloParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(@NotNull HelloParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(@NotNull HelloParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull HelloParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull HelloParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull HelloParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull HelloParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(@NotNull HelloParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(@NotNull HelloParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(@NotNull HelloParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(@NotNull HelloParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(@NotNull HelloParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(@NotNull HelloParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#formalParameterDecls}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterDecls(@NotNull HelloParser.FormalParameterDeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#formalParameterDecls}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterDecls(@NotNull HelloParser.FormalParameterDeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull HelloParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull HelloParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull HelloParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull HelloParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull HelloParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull HelloParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(@NotNull HelloParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(@NotNull HelloParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(@NotNull HelloParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(@NotNull HelloParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(@NotNull HelloParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(@NotNull HelloParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(@NotNull HelloParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(@NotNull HelloParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(@NotNull HelloParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(@NotNull HelloParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(@NotNull HelloParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(@NotNull HelloParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(@NotNull HelloParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(@NotNull HelloParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(@NotNull HelloParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(@NotNull HelloParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(@NotNull HelloParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(@NotNull HelloParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(@NotNull HelloParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(@NotNull HelloParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(@NotNull HelloParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(@NotNull HelloParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(@NotNull HelloParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(@NotNull HelloParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull HelloParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull HelloParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull HelloParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull HelloParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(@NotNull HelloParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(@NotNull HelloParser.GenericMethodDeclarationContext ctx);
}