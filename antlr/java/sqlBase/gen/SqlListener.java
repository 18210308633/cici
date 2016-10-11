// Generated from E:/work_space/LeetCode/cici/antlr/java/sqlBase\Sql.g4 by ANTLR 4.5.1
package sqlBase.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(SqlParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(SqlParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(SqlParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(SqlParser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefault(SqlParser.StatementDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefault(SqlParser.StatementDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code use}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUse(SqlParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code use}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUse(SqlParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableAsSelect}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableAsSelect(SqlParser.CreateTableAsSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableAsSelect}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableAsSelect(SqlParser.CreateTableAsSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(SqlParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(SqlParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(SqlParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(SqlParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertInto}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterInsertInto(SqlParser.InsertIntoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertInto}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitInsertInto(SqlParser.InsertIntoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code delete}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete(SqlParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code delete}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete(SqlParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(SqlParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(SqlParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameColumn}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameColumn(SqlParser.RenameColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameColumn}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameColumn(SqlParser.RenameColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addColumn}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddColumn(SqlParser.AddColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addColumn}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddColumn(SqlParser.AddColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createView}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(SqlParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(SqlParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropView}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropView(SqlParser.DropViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropView}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropView(SqlParser.DropViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explain}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain(SqlParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain(SqlParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(SqlParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(SqlParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showSchemas}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowSchemas(SqlParser.ShowSchemasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showSchemas}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowSchemas(SqlParser.ShowSchemasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCatalogs}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCatalogs(SqlParser.ShowCatalogsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCatalogs}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCatalogs(SqlParser.ShowCatalogsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(SqlParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(SqlParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctions(SqlParser.ShowFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctions(SqlParser.ShowFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showSession}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowSession(SqlParser.ShowSessionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showSession}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowSession(SqlParser.ShowSessionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setSession}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetSession(SqlParser.SetSessionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setSession}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetSession(SqlParser.SetSessionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resetSession}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterResetSession(SqlParser.ResetSessionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resetSession}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitResetSession(SqlParser.ResetSessionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowPartitions(SqlParser.ShowPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowPartitions(SqlParser.ShowPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SqlParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SqlParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#with}.
	 * @param ctx the parse tree
	 */
	void enterWith(SqlParser.WithContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#with}.
	 * @param ctx the parse tree
	 */
	void exitWith(SqlParser.WithContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void enterTableElement(SqlParser.TableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void exitTableElement(SqlParser.TableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tableProperties}.
	 * @param ctx the parse tree
	 */
	void enterTableProperties(SqlParser.TablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tableProperties}.
	 * @param ctx the parse tree
	 */
	void exitTableProperties(SqlParser.TablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void enterTableProperty(SqlParser.TablePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void exitTableProperty(SqlParser.TablePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterQueryNoWith(SqlParser.QueryNoWithContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitQueryNoWith(SqlParser.QueryNoWithContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link SqlParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterQueryTermDefault(SqlParser.QueryTermDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link SqlParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitQueryTermDefault(SqlParser.QueryTermDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link SqlParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterSetOperation(SqlParser.SetOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link SqlParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitSetOperation(SqlParser.SetOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link SqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimaryDefault(SqlParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link SqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimaryDefault(SqlParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table}
	 * labeled alternative in {@link SqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTable(SqlParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table}
	 * labeled alternative in {@link SqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTable(SqlParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTable}
	 * labeled alternative in {@link SqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTable(SqlParser.InlineTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTable}
	 * labeled alternative in {@link SqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTable(SqlParser.InlineTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link SqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(SqlParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link SqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(SqlParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(SqlParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(SqlParser.SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(SqlParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(SqlParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleGroupingSet}
	 * labeled alternative in {@link SqlParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void enterSingleGroupingSet(SqlParser.SingleGroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleGroupingSet}
	 * labeled alternative in {@link SqlParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void exitSingleGroupingSet(SqlParser.SingleGroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rollup}
	 * labeled alternative in {@link SqlParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void enterRollup(SqlParser.RollupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rollup}
	 * labeled alternative in {@link SqlParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void exitRollup(SqlParser.RollupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cube}
	 * labeled alternative in {@link SqlParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void enterCube(SqlParser.CubeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cube}
	 * labeled alternative in {@link SqlParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void exitCube(SqlParser.CubeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleGroupingSets}
	 * labeled alternative in {@link SqlParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void enterMultipleGroupingSets(SqlParser.MultipleGroupingSetsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleGroupingSets}
	 * labeled alternative in {@link SqlParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void exitMultipleGroupingSets(SqlParser.MultipleGroupingSetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#groupingExpressions}.
	 * @param ctx the parse tree
	 */
	void enterGroupingExpressions(SqlParser.GroupingExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#groupingExpressions}.
	 * @param ctx the parse tree
	 */
	void exitGroupingExpressions(SqlParser.GroupingExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSet(SqlParser.GroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSet(SqlParser.GroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void enterNamedQuery(SqlParser.NamedQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void exitNamedQuery(SqlParser.NamedQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(SqlParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(SqlParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectSingle}
	 * labeled alternative in {@link SqlParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectSingle(SqlParser.SelectSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectSingle}
	 * labeled alternative in {@link SqlParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectSingle(SqlParser.SelectSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectAll}
	 * labeled alternative in {@link SqlParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectAll(SqlParser.SelectAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectAll}
	 * labeled alternative in {@link SqlParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectAll(SqlParser.SelectAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationDefault}
	 * labeled alternative in {@link SqlParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelationDefault(SqlParser.RelationDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationDefault}
	 * labeled alternative in {@link SqlParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelationDefault(SqlParser.RelationDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinRelation}
	 * labeled alternative in {@link SqlParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterJoinRelation(SqlParser.JoinRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinRelation}
	 * labeled alternative in {@link SqlParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitJoinRelation(SqlParser.JoinRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(SqlParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(SqlParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void enterJoinCriteria(SqlParser.JoinCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void exitJoinCriteria(SqlParser.JoinCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sampledRelation}.
	 * @param ctx the parse tree
	 */
	void enterSampledRelation(SqlParser.SampledRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sampledRelation}.
	 * @param ctx the parse tree
	 */
	void exitSampledRelation(SqlParser.SampledRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sampleType}.
	 * @param ctx the parse tree
	 */
	void enterSampleType(SqlParser.SampleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sampleType}.
	 * @param ctx the parse tree
	 */
	void exitSampleType(SqlParser.SampleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#aliasedRelation}.
	 * @param ctx the parse tree
	 */
	void enterAliasedRelation(SqlParser.AliasedRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#aliasedRelation}.
	 * @param ctx the parse tree
	 */
	void exitAliasedRelation(SqlParser.AliasedRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#columnAliases}.
	 * @param ctx the parse tree
	 */
	void enterColumnAliases(SqlParser.ColumnAliasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#columnAliases}.
	 * @param ctx the parse tree
	 */
	void exitColumnAliases(SqlParser.ColumnAliasesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link SqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SqlParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link SqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SqlParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryRelation}
	 * labeled alternative in {@link SqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryRelation(SqlParser.SubqueryRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryRelation}
	 * labeled alternative in {@link SqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryRelation(SqlParser.SubqueryRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unnest}
	 * labeled alternative in {@link SqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterUnnest(SqlParser.UnnestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unnest}
	 * labeled alternative in {@link SqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitUnnest(SqlParser.UnnestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedRelation}
	 * labeled alternative in {@link SqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedRelation(SqlParser.ParenthesizedRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedRelation}
	 * labeled alternative in {@link SqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedRelation(SqlParser.ParenthesizedRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(SqlParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(SqlParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link SqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanDefault(SqlParser.BooleanDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link SqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanDefault(SqlParser.BooleanDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link SqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(SqlParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link SqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(SqlParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(SqlParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(SqlParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#predicated}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(SqlParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#predicated}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(SqlParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterComparison(SqlParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitComparison(SqlParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code between}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBetween(SqlParser.BetweenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code between}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBetween(SqlParser.BetweenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inList}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterInList(SqlParser.InListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inList}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitInList(SqlParser.InListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inSubquery}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterInSubquery(SqlParser.InSubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inSubquery}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitInSubquery(SqlParser.InSubqueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code like}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterLike(SqlParser.LikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code like}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitLike(SqlParser.LikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterNullPredicate(SqlParser.NullPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullPredicate}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitNullPredicate(SqlParser.NullPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code distinctFrom}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterDistinctFrom(SqlParser.DistinctFromContext ctx);
	/**
	 * Exit a parse tree produced by the {@code distinctFrom}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitDistinctFrom(SqlParser.DistinctFromContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(SqlParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(SqlParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concatenation}
	 * labeled alternative in {@link SqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(SqlParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatenation}
	 * labeled alternative in {@link SqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(SqlParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(SqlParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(SqlParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(SqlParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(SqlParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atTimeZone}
	 * labeled alternative in {@link SqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtTimeZone(SqlParser.AtTimeZoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atTimeZone}
	 * labeled alternative in {@link SqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtTimeZone(SqlParser.AtTimeZoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(SqlParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(SqlParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(SqlParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(SqlParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(SqlParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(SqlParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(SqlParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(SqlParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructor(SqlParser.RowConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructor(SqlParser.RowConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(SqlParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(SqlParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(SqlParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(SqlParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specialDateTimeFunction}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSpecialDateTimeFunction(SqlParser.SpecialDateTimeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specialDateTimeFunction}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSpecialDateTimeFunction(SqlParser.SpecialDateTimeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpression(SqlParser.SubqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpression(SqlParser.SubqueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substring}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubstring(SqlParser.SubstringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substring}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubstring(SqlParser.SubstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(SqlParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(SqlParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambda(SqlParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambda(SqlParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extract}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterExtract(SqlParser.ExtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitExtract(SqlParser.ExtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(SqlParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(SqlParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(SqlParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(SqlParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayConstructor}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayConstructor(SqlParser.ArrayConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayConstructor}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayConstructor(SqlParser.ArrayConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SqlParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SqlParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalize}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNormalize(SqlParser.NormalizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalize}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNormalize(SqlParser.NormalizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code position}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPosition(SqlParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code position}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPosition(SqlParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(SqlParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(SqlParser.SearchedCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLiteral(SqlParser.IntervalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLiteral(SqlParser.IntervalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(SqlParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(SqlParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(SqlParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(SqlParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timeZoneInterval}
	 * labeled alternative in {@link SqlParser#timeZoneSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTimeZoneInterval(SqlParser.TimeZoneIntervalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timeZoneInterval}
	 * labeled alternative in {@link SqlParser#timeZoneSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTimeZoneInterval(SqlParser.TimeZoneIntervalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timeZoneString}
	 * labeled alternative in {@link SqlParser#timeZoneSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTimeZoneString(SqlParser.TimeZoneStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timeZoneString}
	 * labeled alternative in {@link SqlParser#timeZoneSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTimeZoneString(SqlParser.TimeZoneStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SqlParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SqlParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(SqlParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(SqlParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(SqlParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(SqlParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void enterIntervalField(SqlParser.IntervalFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void exitIntervalField(SqlParser.IntervalFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SqlParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SqlParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(SqlParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(SqlParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(SqlParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(SqlParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#over}.
	 * @param ctx the parse tree
	 */
	void enterOver(SqlParser.OverContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#over}.
	 * @param ctx the parse tree
	 */
	void exitOver(SqlParser.OverContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrame(SqlParser.WindowFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrame(SqlParser.WindowFrameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unboundedFrame}
	 * labeled alternative in {@link SqlParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterUnboundedFrame(SqlParser.UnboundedFrameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unboundedFrame}
	 * labeled alternative in {@link SqlParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitUnboundedFrame(SqlParser.UnboundedFrameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentRowBound}
	 * labeled alternative in {@link SqlParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterCurrentRowBound(SqlParser.CurrentRowBoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentRowBound}
	 * labeled alternative in {@link SqlParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitCurrentRowBound(SqlParser.CurrentRowBoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boundedFrame}
	 * labeled alternative in {@link SqlParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterBoundedFrame(SqlParser.BoundedFrameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boundedFrame}
	 * labeled alternative in {@link SqlParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitBoundedFrame(SqlParser.BoundedFrameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explainFormat}
	 * labeled alternative in {@link SqlParser#explainOption}.
	 * @param ctx the parse tree
	 */
	void enterExplainFormat(SqlParser.ExplainFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explainFormat}
	 * labeled alternative in {@link SqlParser#explainOption}.
	 * @param ctx the parse tree
	 */
	void exitExplainFormat(SqlParser.ExplainFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explainType}
	 * labeled alternative in {@link SqlParser#explainOption}.
	 * @param ctx the parse tree
	 */
	void enterExplainType(SqlParser.ExplainTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explainType}
	 * labeled alternative in {@link SqlParser#explainOption}.
	 * @param ctx the parse tree
	 */
	void exitExplainType(SqlParser.ExplainTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(SqlParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(SqlParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(SqlParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(SqlParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link SqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(SqlParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link SqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(SqlParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code backQuotedIdentifier}
	 * labeled alternative in {@link SqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterBackQuotedIdentifier(SqlParser.BackQuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code backQuotedIdentifier}
	 * labeled alternative in {@link SqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitBackQuotedIdentifier(SqlParser.BackQuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code digitIdentifier}
	 * labeled alternative in {@link SqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterDigitIdentifier(SqlParser.DigitIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code digitIdentifier}
	 * labeled alternative in {@link SqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitDigitIdentifier(SqlParser.DigitIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(SqlParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(SqlParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(SqlParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(SqlParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(SqlParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(SqlParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(SqlParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(SqlParser.NonReservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#normalForm}.
	 * @param ctx the parse tree
	 */
	void enterNormalForm(SqlParser.NormalFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#normalForm}.
	 * @param ctx the parse tree
	 */
	void exitNormalForm(SqlParser.NormalFormContext ctx);
}