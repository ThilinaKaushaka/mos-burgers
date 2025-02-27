
document.getElementById("btn-customer").addEventListener("click", function() {
    document.getElementById("custom-home-section").innerHTML = `

        <br><br><br>


        <div class="container">

            <div class="row">

                <div class="col">


                    <!--CUSTOMER MANAGE CONTAINER -->
                    <div class="container cus" style="padding-left: 40px; width: 450px;">
                        <div class="row">
                            <div style="height: 35px;"></div>
                        </div>
                        <div class="row">

                                <!--customer manage button -->
                                <div class="col pnl-customer-button">

                                    <div class="customer-manage-icon ">
                                        <img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACQAAAAkCAYAAADhAJiYAAAAAXNSR0IArs4c6QAAAkhJREFUWEftlj+I1UAQxr/J41529xWCjeBpYSEoZyPKCVqonYWFYC9qZWEh2Igi3gkKWmivYGcrCtfYqWgjYqV4lqKi2Fi9nc3zXkYjQXIhySbxIodku2Rmv/ntzOwfwjobtM540AP5KtJn6P/NkHPuqIjsTVZIRK+UUku+1baxe3vIOXdERO4A2JoL8AHASa31kzaBy+ZUAllr54noGYCwRMAGQTAfhuHbtYKqBGLm5wAOVAUTkUfGmGOdA1lrZ4noU41AK0qpDURka/h6XUozZK3dT0QvvAoA4jjeMxqNXpf5MvMCgCupfVFrnXwXjlKgKIrm4jh+UwcoCIKdYRgudwokIgPn3DcAGz1QX5VSm4lIOgVKxJn5KoDLnqa+YIy5UeWzJiVLAojIjHPuMYDDRQGJ6GEYhseJKM7aU4Dsr0MADqY/ngJYdXZle8p7MIqIjqLotIicAbArFU2a/a5S6j4RreRhmbm0fEUL01r/4fAC1WnqfwaUNPZkMpmbTqc7iGg7gJk0+A8ReT8YDJaHw+E7Ipp2XjJmPgHgJoBNnix9EZGzxpgHne0y59xtETnXsFwLv3phsWjOX+0yZr4G4GJDmN/uInLeGHOroKfandTj8Xh3EASlV0ANyKS3thljPhf0VPOrg5nvAThVI3CVy3Wt9aW2Gqu2PTN/BLClrVg676XWel9bjTyQq3iM1YpBRN+VUr77r1QrD9TohC1TzZ68tVaRccoDlb5TmghXvXd8Op1cHb6gVfYeyJe9PkN9hnwZ8Nl/AtM64iXj9HvPAAAAAElFTkSuQmCC"/>
                                    </div>
                                
    
                                
                                    <div class="customer-manage-icon">
                                        <img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACQAAAAkCAYAAADhAJiYAAAAAXNSR0IArs4c6QAAAm9JREFUWEftmL9rFEEUx9+7RW9mub3WFAGDSMDW0tzFNDaJhY1YWFpqaSWCWlhpp3+ChYVgo2AhQRPQPggqJBJBQYxY7e3surM882QXlr3Zn7d3BpLpbpjvzme/7917M4twwAYeMB443EBKqQUAeEJEV2zb/m6KTq5DSqnzALAEAMdrhnVDSrme1XieN4+I7wFgHgC+EtGSCcoI5HneY0S8XhOEl68LIVYRMUhrXdedsyyLYdihZBihxoBGo9GlTqfzvCHMRURUWa1S6gUArBme+YWIltNOjQEppW4BwP1Y/BYA3lSAC4UQD7POJDrXdU9YlrUBAIuGZ72WUl5I5k1AdwHgTrzgnpSSf9ceQRCcCYJgr9/v/2JxDhSHbWDb9repAvm+f5qI3gHA7zAMBxkonj8FAAwxlFLupt+2dYd8318kIg71XLzRR631iuM4P2OnOMGfIuI1IcRO1vpWgWJnNlMwyX6f004Vxb81oAKYWlCtAFWAYahPWutlx3H2pupQRZhtrfW5MhgGncihuDdxBU4S2PTy21EUDXu93g9DwVxo7V8Ww3ACc2/KG0UwXOswW+caOTQpjOd5NxHxwT7QWOGtDTQpjFLqKh9B8jpBEyCurCcLwrQTRdHAlDOsUUoVtqYmQFQAs0tEw3RvMiTyzIBKYWbpUCWYWQFVhpkKUO2DUUbQelIfAZVZ+j8canLIr8O5AgB85+NxW0qZXCj+TYwVRt/3V4noZZ0dmq4losu2bT9L6/Muio8Q8UbTjSrqPgghziJiWAoU1wu2dbB/RztWcYOqy/4g4la3232FiDorOtxfP6pYeORQmUt/AeFjuDSy+6iLAAAAAElFTkSuQmCC"/>
                                    </div>
                                
    
                                
                                    <div class="customer-manage-icon">
                                        <img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACQAAAAkCAYAAADhAJiYAAAAAXNSR0IArs4c6QAABEJJREFUWEftl1uIHEUUhv/T6PSp2s3sRkRJNF6yizH4mKgPoogXiBIVb2wUyaIxDxHFB6+I6INIVPIgQrwEY0S8QDQQUUSEJV6iCF5fDLqSqBBFMJrZwa6utmfnODXWSG87u90zwWQFz9P21Km/vjpVdc5Zwjwzmmc8+O8CTU1NHVOpVK4BcAWAUQCLfXR/EpFJIno9SZIdw8PDBw8l6oURMsacRET3AxgHUClYLBGRrQA2aq339wM2J5Ax5loierEESH5tQ0RjzPxmr1CzAhlj7iGiR3KCH4rITgAfJEnyjRsLw/B0AOcR0dUAzsr6E9EGZn66F6iuQMaY64jo5YzQ1yJyo9b647nErbWrRGQLgCXeT4hoNTO/VRbqH0DW2hER+cpt3okQ0ZdJklw4NDT0WxnRKIoWBUHwLoDTvH89TdORarV6oMz8bkA7ROQqP3lvmqZnV6vVX923iBydJMk6EbkTwIj3mQSwiZm3tS5/w/1mjDmBiD4DcLz3eUopdUvPQEmSLG82m3s6E5vN5pkDAwOfepiqtfYjAGd0EyaiLxqNxqWDg4M/u3Fr7WoRecP7NtI0XVQmSjMiFMexe94P+aPaycxXZhc3xjxORLfPsdMJpdRFnfE4jj8BsNJ/36SU2lYUpTzQbgDn+Ihcr7V+JS8Qx7G7tAdE5Ek3FgTBbSJyd8ZvXCn1gj+6O4hokx/brpQa6xXoewAne6AlZZNbNnLumLTWlzuNKIpWBEHQPnIi+pyZV/QKFAHQbhIzh0T0R5GAG4/j+JRWJv/O+/6olDrR/V2r1RaGYdh+nSJS01ovLNLLH9nvAAY80AIict99m4gssNbWvcAvSqnjisTyQN/6wulCvIyZ3ZPu23Kv9j2l1PlFYnmgCQAX+Ek3K6VcoezbrLUbOpe/lZNK5aIZQMaYu4joMU/wtlLqkr5p/rpbuwC0o0JEtzLz5iK9GUDW2lERccfWNhE5V2vtUkHPZq29WETe8ROj6enp0U7SnEusW+l4VURcI+bshzRNV5bJsNlFoihaHASBS4rtJk5E7tVaP1pmV92AloqIKx+HUlzdUS3zAPuYeXnZFFK2/djTbDbHO3Vttp369sP1P+3k6m2CmVd1Cm9RlGZt0OI4vg/AwzmB912DJiK7tdaTtVqNwjB0u3cX1zVoXTMxEb0WhuEaIpruG8hNjOPY9dHPAjiqSCg73irAB0XEtR9/F1oA25nZNX7Nni513jmO41MBPADghhJgDRHZrJR6EEDdWuu6zjUZzZeYee1cUIX/dXTE6vX6sZVKZay188sALHUvSEQaQRDsA+CK8t7Wb1uYOZs2yFr7PIC1GaitzLyeiKRbpEoD9XJkWV8R6Qb1nFJq3REB8nnIQT0DYH0Gomsp+dcjlI2Cb+46UBuVUu4lz7DDCuRWNsY8AWC/1rpTM48sUNFdPOwR+h+oKAJF4/PuyP4EwPXFNNSLyfMAAAAASUVORK5CYII="/>
                                    </div>
                                
    
                                
                                    <div class="customer-manage-icon">
                                        <img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACQAAAAkCAYAAADhAJiYAAAAAXNSR0IArs4c6QAAAU5JREFUWEftWLFKxEAQfRuE7KTxM0TBzg+wFf/Ab9BOsBH0CkGw1J+wF2yvvfYKxf8QZoKQ0YAex10uO5vkIMIupNo3My9vZjOTdRjZciPjg/9PSFV3RWQGYC+g7of3/sg59xmThSiFVDUTkRcAJ8Ygr977U+ecGvFxKRORe1W9sjr/xd0R0bXVZk0hZr4FcGN10BM3IaI63mIlQiuKhhXqmYLe5q2njJmPAdTPkGtKRNNNDkOEtlHga2lqLerlzS2duEQoVG/DKkREi7pj5saWEMAkQkgK/VVtqqGmD2M6ZaHWkRRKCq10vuh5aHQ1BGCy9FKb/k7aMMM219BsYdjvTkhEzlX10RDEDHHOXXjvnzrN1GVZ7ldV9WaOZgBmWXaQ5/l7J0K1ETOf/VwYXKrqIYAdQ8wmyBeAuao+FEXx3OYj6rKhI5kos0QoJNc30OQUNNp7ozoAAAAASUVORK5CYII="/>
                                    </div>
                                </div>
                            

                        </div>


                        <!--customer input -->
                        <div class="row">
                            <div class="col">
                                <br><br>

                                <!--customer id -->
                                <div class="form-control" style="background-color:transparent; border: 0px;">
                                    <input type="value" required="">
                                    <label>
                                        <span style="transition-delay:0ms">C</span>
                                        <span style="transition-delay:50ms">u</span>
                                        <span style="transition-delay:100ms">s</span>
                                        <span style="transition-delay:150ms">t</span>
                                        <span style="transition-delay:200ms">o</span>
                                        <span style="transition-delay:250ms">m</span>
                                        <span style="transition-delay:300ms">e</span>
                                        <span style="transition-delay:350ms">r</span>
                                        <span style="transition-delay:350ms"> </span>
                                        <span style="transition-delay:400ms">I</span>
                                        <span style="transition-delay:450ms">D</span>
                                    
                                    </label>
                                </div>
                            </div>
                        </div>
            
                        <div class="row">
                            <div class="col">

                                <!--customer name -->
                                <div class="form-control" style="background-color:transparent; border: 0px;">
                                    <input type="value" required="">
                                    <label>
                                        <span style="transition-delay:0ms">C</span>
                                        <span style="transition-delay:50ms">u</span>
                                        <span style="transition-delay:100ms">s</span>
                                        <span style="transition-delay:150ms">t</span>
                                        <span style="transition-delay:200ms">o</span>
                                        <span style="transition-delay:250ms">m</span>
                                        <span style="transition-delay:300ms">e</span>
                                        <span style="transition-delay:350ms">r</span>
                                        <span style="transition-delay:350ms"> </span>
                                        <span style="transition-delay:400ms">N</span>
                                        <span style="transition-delay:450ms">a</span>
                                        <span style="transition-delay:500ms">m</span>
                                        <span style="transition-delay:550ms">e</span>
                                    
                                    </label>
                                </div>
                            </div>
                        </div>
            
                        <div class="row">
                            <div class="col">

                                <!--tp no -->
                                <div class="form-control" style="background-color:transparent; border: 0px;">
                                    <input type="value" required="">
                                    <label>
                                        <span style="transition-delay:0ms">T</span>
                                        <span style="transition-delay:50ms">e</span>
                                        <span style="transition-delay:100ms">l</span>
                                        <span style="transition-delay:150ms">e</span>
                                        <span style="transition-delay:200ms">p</span>
                                        <span style="transition-delay:250ms">h</span>
                                        <span style="transition-delay:300ms">o</span>
                                        <span style="transition-delay:350ms">n</span>
                                        <span style="transition-delay:350ms">e</span>
                                        <span style="transition-delay:400ms"> </span>
                                        <span style="transition-delay:450ms">N</span>
                                        <span style="transition-delay:500ms">o</span>
                                    </label>
                                </div>
                            </div>
                        </div>
            
                        <div class="row">
                            <div class="col">

                                <!--loyalty points -->
                                <div class="form-control" style="background-color:transparent; border: 0px;">
                                    <input type="value" required="">
                                    <label>
                                        <span style="transition-delay:0ms">P</span>
                                        <span style="transition-delay:50ms">o</span>
                                        <span style="transition-delay:100ms">i</span>
                                        <span style="transition-delay:150ms">n</span>
                                        <span style="transition-delay:200ms">t</span>
                                        <span style="transition-delay:250ms">s</span>
                                    </label>
                                </div>
                            </div>
                        </div>
                    </div>

       
                </div>


                <div class="col">

                    <div class="customer-table-div">

                        <table class=" table table-hover text-center  customer-table text-white"  >
                        <tr>

                            <thead>
                                <th style="background-color:#171625; color: rgb(216, 215, 215) ">Customer ID</th>
                                <th style="background-color:#171625; color: rgb(216, 215, 215)">Customer Name</th>
                                <th style="background-color:#171625; color: rgb(216, 215, 215)">Telephone No</th>
                                <th style="background-color:#171625; color: rgb(216, 215, 215)">Points</th>
                            </thead>    
                        </tr>


                        <tbody class="table-group-divider">

                            <tr>
                                <td>1</td>
                                <td>Thilina</td>
                                <td>0711234567</td>
                                <td>100</td>
                            </tr>

                            <tr>
                                <td>1</td>
                                <td>Thilina</td>
                                <td>0711234567</td>
                                <td>100</td>
                            </tr>

                            <tr>
                                <td>1</td>
                                <td>Thilina</td>
                                <td>0711234567</td>
                                <td>100</td>
                            </tr>

                            <tr>
                                <td>1</td>
                                <td>Thilina</td>
                                <td>0711234567</td>
                                <td>100</td>
                            </tr>

                            <tr>
                                <td>1</td>
                                <td>Thilina</td>
                                <td>0711234567</td>
                                <td>100</td>
                            </tr>

                            <tr>
                                <td>1</td>
                                <td>Thilina</td>
                                <td>0711234567</td>
                                <td>100</td>
                            </tr>

                            <tr>
                                <td>1</td>
                                <td>Thilina</td>
                                <td>0711234567</td>
                                <td>100</td>
                            </tr>

                            <tr>
                                <td>1</td>
                                <td>Thilina</td>
                                <td>0711234567</td>
                                <td>100</td>
                            </tr>

                            <tr>
                                <td>1</td>
                                <td>Thilina</td>
                                <td>0711234567</td>
                                <td>100</td>
                            </tr>

                            <tr>
                                <td>1</td>
                                <td>Thilina</td>
                                <td>0711234567</td>
                                <td>100</td>
                            </tr>

                            <tr>
                                <td>1</td>
                                <td>Thilina</td>
                                <td>0711234567</td>
                                <td>100</td>
                            </tr>


                            <tr>
                                <td>1</td>
                                <td>Thilina</td>
                                <td>0711234567</td>
                                <td>100</td>
                            </tr>


                            <tr>
                                <td>1</td>
                                <td>Thilina</td>
                                <td>0711234567</td>
                                <td>100</td>
                            </tr>

                            <tr>
                                <td>1</td>
                                <td>Thilina</td>
                                <td>0711234567</td>
                                <td>100</td>
                            </tr>

                            <tr>
                                <td>1</td>
                                <td>Thilina</td>
                                <td>0711234567</td>
                                <td>100</td>
                            </tr>

                            <tr>
                                <td>1</td>
                                <td>Thilina</td>
                                <td>0711234567</td>
                                <td>100</td>
                            </tr>
                        </tbody>    
                    </table>

                    </div>
                    
                </div>
            </div>
        </div>
    `;   
});

